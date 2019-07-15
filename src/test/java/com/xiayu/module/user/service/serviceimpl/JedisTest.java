package com.xiayu.module.user.service.serviceimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname JedisTest
 * @Description
 * @Author hello
 * @Date 2019/7/15 16:48
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class JedisTest {
    @Autowired
    RedissonClient redissonClient;

    @Test
    public void test(){


    }
}
