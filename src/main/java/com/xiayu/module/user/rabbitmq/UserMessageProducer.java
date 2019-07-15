package com.xiayu.module.user.rabbitmq;

import com.xiayu.module.user.entity.User;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Classname UserMessageProducer
 * @Description
 * @Author hello
 * @Date 2019/7/15 10:05
 * @Version 1.0
 **/
@Component
public class UserMessageProducer {

    @Autowired
    private AmqpTemplate template;

    public void sendDirectMsg(String routingKey, User user) {
        for (int i = 0; i < 1000000; i++){
            template.convertAndSend(routingKey, user);
        }
    }

    public void sendExchangeMsg(String exchange, String routingKey, String msg) {
        template.convertAndSend(exchange, routingKey, msg);
    }

    public void sendHeadersMsg(String exchange, String msg, Map<String, Object> map) {
        template.convertAndSend(exchange, null, msg, message -> {
            message.getMessageProperties().getHeaders().putAll(map);
            return message;
        });
    }
}
