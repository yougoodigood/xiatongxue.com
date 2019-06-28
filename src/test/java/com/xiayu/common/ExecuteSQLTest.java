package com.xiayu.common;

import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ExecuteSQLTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ExecuteSQL executeSQL;
    @Autowired
    UserService userService;

    @Test
    public void createTable() {
        String sql = "create table t_temp(id varchar(255) not null primary key);";
        logger.info("execute sql:" + sql);
        executeSQL.createTable(sql);
        logger.info("execute finished!!!");
    }

    @Test
    public void executeDmlAndDdl() {
        String sql = "create table t_temp(id varchar(255) not null primary key);";
        logger.error("execute sql:" + sql);
        executeSQL.createTable(sql);
        logger.error("execute finished!!!");
    }

    @Test
    public void insertUser(){
        User user = new User();
        user.setId("3422");
        Date date = new Date();
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userService.addUser(user);
    }

    @Test
    public void getUser(){
        Optional<User> user = userService.findById("4532");
        user.ifPresent(user1 -> System.out.println());
        logger.info("finished");
    }
}