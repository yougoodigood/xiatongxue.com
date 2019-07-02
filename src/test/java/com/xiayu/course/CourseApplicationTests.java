package com.xiayu.course;

import com.alibaba.fastjson.JSON;
import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
//        Object object = JSON.toJSON(userService.getUserList());
//        User user = new User();
//        user.setNickname("孙立前");
//        user.setId("23222332");
//        user.setAge(25);
//        User user2 = new User();
//        user.setNickname("孙立前");
//        user.setId("23222332");
//        user.setAge(25);
//        List<User> userList = new ArrayList<>();
//        userList.add(user);
//        userList.add(user2);
        List<User> userList = userService.getUserList();
        logger.info(JSON.toJSONString(userList));

    }

}
