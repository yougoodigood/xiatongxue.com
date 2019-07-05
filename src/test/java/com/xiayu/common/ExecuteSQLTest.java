package com.xiayu.common;

import com.xiayu.module.user.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ExecuteSQLTest {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    ExecuteSQL executeSQL;
//    @Autowired
//    UserService userService;
//
//    @Test
//    public void createTable() {
//        String sql = "create table t_temp(id varchar(255) not null primary key);";
//        logger.info("execute sql:" + sql);
//        executeSQL.createTable(sql);
//        logger.info("execute finished!!!");
//    }
//
//    @Test
//    public void executeDmlAndDdl() {
//        String sql = "create table t_temp(id varchar(255) not null primary key);";
//        logger.error("execute sql:" + sql);
//        executeSQL.createTable(sql);
//        logger.error("execute finished!!!");
//    }
//
//    @Test
//    public void insertUser(){
//        User user = new User();
//        user.setId("3422");
//        Date date = new Date();
//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());
//        userService.addUser(user);
//    }
//
//    @Test
//    public void getUser(){
////        List<User> users = userService.getUserList();
////        logger.info("finished");
//
////        Optional<User> user = userService.findById("1");
////        UserClass userClass = user.get().getUserClass();
////        logger.info("finished");
//    }
}