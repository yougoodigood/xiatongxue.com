package com.xiayu.course;

import com.alibaba.fastjson.JSON;
import com.xiayu.common.response.UserResponse;
import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseApplicationTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        UserResponse userResponse = new UserResponse();
        user.setId("1");
        user.setAge(25);
        user.setNickname("slq");
        user.setEmail("13267392322@qq.com");
        BeanCopier beanCopier = BeanCopier.create(User.class, UserResponse.class, false);
        beanCopier.copy(user,userResponse,null);
        System.out.println(userResponse.toString());
    }

}
