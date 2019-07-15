package com.xiayu.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * @Classname RabbitMqConfig
 * @Description
 * @Author hello
 * @Date 2019/7/15 9:28
 * @Version 1.0
 **/
@Configuration
public class RabbitMqConfig {
    private static final String topicExchangeName = "topic-exchange";
    private static final String fanoutExchangeName = "fanout-exchange";
    private static final String headersExchangeName = "headers-exchange";
    private static final String queueName = "queue";

    @Bean
    public Queue queue(){
        return new Queue(queueName,false,true,true);
    }

    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange(topicExchangeName);
    }

    @Bean
    Binding topicBinding(Queue queue,TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("org.xiayu.#");
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange(fanoutExchangeName);
    }

    @Bean
    Binding fanoutBinding(Queue queue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    HeadersExchange headersExchange(){
        return new HeadersExchange(headersExchangeName);
    }

    @Bean
    Binding headersBinding(Queue queue,HeadersExchange headersExchange){
        Map<String,Object> map = new HashMap<>();
        map.put("First","A");
        map.put("Fourth","D");
        //whereAny 部分匹配  whereAll全部匹配
//        return BindingBuilder.bind(queue).to(headersExchange).whereAll(map).match();
        return BindingBuilder.bind(queue).to(headersExchange).whereAny(map).match();
    }

}
