package com.xiayu.module.user.rabbitmq;

import com.xiayu.module.user.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Classname UserMessageConsumer
 * @Description
 * @Author hello
 * @Date 2019/7/15 10:11
 * @Version 1.0
 **/
@Component
public class UserMessageConsumer {
    private int i = 0;
    @RabbitListener(queues = "queue")
    public void processMessage(User user) throws InterruptedException {
        i ++;
        System.out.format("receiving message: --------[%s] ----------\n.",user);
        Thread.sleep(100);
        System.out.println("i = " + i);
    }
}
