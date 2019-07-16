package com.xiayu.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;

/**
 * @Classname RedisConfig
 * @Description
 * @Author hello
 * @Date 2019/7/15 16:16
 * @Version 1.0
 **/
@Configuration
@EnableCaching
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String hostName;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.timeout}")
    private int timeOut;
    @Value("${spring.redis.password}")
    private String password;

//    @Bean
//    public KeyGenerator wiselyKeyGenerator(){
//        return new KeyGenerator() {
//            @Override
//            public Object generate(Object o, Method method, Object... objects) {
//                StringBuilder sb = new StringBuilder();
//                sb.append(o.getClass().getName());
//                sb.append(method.getName());
//                for(Object object : objects){
//                    sb.append(object.toString());
//                }
//                return sb.toString();
//            }
//        };
//    }
//
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory(){
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//        jedisConnectionFactory.setHostName(hostName);
//        jedisConnectionFactory.setPort(port);
//        jedisConnectionFactory.setTimeout(timeOut);
//        jedisConnectionFactory.setPassword(password);
//        return jedisConnectionFactory;
//    }
//
////    @Bean
////    public RedisCacheManager redisCacheManager(RedisTemplate redisTemplate){
////        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
////        redisCacheManager.setDefaultExpiration(10);
////        return redisCacheManager;
////    }
//
//    @Bean
//    public RedisTemplate dataRedisTemplate(JedisConnectionFactory jedisConnectionFactory){
//        RedisTemplate redisTemplate = new RedisTemplate();
//        StringRedisSerializer keyRedisSerializer = new StringRedisSerializer();
//        JdkSerializationRedisSerializer jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();
//        redisTemplate.setKeySerializer(keyRedisSerializer);
//        redisTemplate.setValueSerializer(jdkSerializationRedisSerializer);
//        redisTemplate.setHashKeySerializer(keyRedisSerializer);
//        redisTemplate.setHashValueSerializer(jdkSerializationRedisSerializer);
//        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
}
