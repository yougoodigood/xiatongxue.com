package com.xiayu.module.user.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

/**
 * @Classname UserRabbitTemplateConsumer
 * @Description
 * @Author hello
 * @Date 2019/7/15 13:35
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = "queue")
public class UserRabbitTemplateConsumer {
    @RabbitHandler
    public void process(Object object, Channel channel, Message message){
        System.out.println("收到信息" + (String) object + "收到时间" + new Date());
//        try {
////            channel.basicAck(message.getMessageProperties().getDeliveryTag(),true);
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("receiver fail");
//        }
    }
}
