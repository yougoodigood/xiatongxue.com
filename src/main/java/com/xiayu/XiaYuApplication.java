package com.xiayu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

@SpringBootApplication
public class XiaYuApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(XiaYuApplication.class, args);
    }

    @Bean
    public OpenEntityManagerInViewFilter openEntityManagerInViewFilter() {
        return new OpenEntityManagerInViewFilter();
    }
}
