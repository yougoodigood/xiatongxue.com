package com.xiayu.module.user.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname UseRabbitTemplateProducer
 * @Description
 * @Author hello
 * @Date 2019/7/15 13:25
 * @Version 1.0
 **/
@Component
public class UseRabbitTemplateProducer implements RabbitTemplate.ReturnCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Object object){
        this.rabbitTemplate.convertAndSend(object);
        this.rabbitTemplate.setReturnCallback(this);
        this.rabbitTemplate.setConfirmCallback(((correlationData, ack, cause) -> {
            if (!ack){
                System.out.println("message send error:" + cause + correlationData.toString());
            }else {
                System.out.println("message send success");
            }
        }));
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("producer 返回消息确认成功" + message.toString() + "=====" + i + "====" + s1 + "=====" + s2);
    }
}
