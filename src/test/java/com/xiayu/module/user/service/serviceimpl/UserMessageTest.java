package com.xiayu.module.user.service.serviceimpl;

import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.rabbitmq.UseRabbitTemplateProducer;
import com.xiayu.module.user.rabbitmq.UserMessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname UserMessageTest
 * @Description
 * @Author hello
 * @Date 2019/7/15 10:13
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMessageTest {
    @Autowired
    private UserMessageProducer producer;
    @Autowired
    private UseRabbitTemplateProducer useRabbitTemplateProducer;

    @Test
    public void sendDirectMsg(){
        User user = new User();
        user.setId("121323232324433");
        user.setEmail("1326737913@qq.com");
        user.setLoginName("dabuliedian");
        producer.sendDirectMsg("cord",user);
    }

    @Test
    public void sendTopicMsg(){
        producer.sendExchangeMsg("topic-exchange","org.cord.test","hello world");
    }

    @Test
    public void sendFanoutMsg(){
        producer.sendExchangeMsg("fanout-exchange","abcdefg",String.valueOf(System.currentTimeMillis()));
    }

    @Test
    public void sendHeaderMsg(){
        Map<String,Object> map = new HashMap<>();
        map.put("First","A");
        producer.sendHeadersMsg("headers-exchange","hello world",map);
    }

    @Test
    public void sendRabbitTemplateMsg(){
        User user = new User();
        user.setEmail("132674433");
        user.setLoginName("dabuliedian");
        useRabbitTemplateProducer.send("hello world message");
    }

    @Test
    public void test1(){

        synchronized (this){
            System.out.println("同步代码块");
        }
    }
}
