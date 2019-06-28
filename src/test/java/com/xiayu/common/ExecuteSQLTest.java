package com.xiayu.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ExecuteSQLTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ExecuteSQL executeSQL;

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
        logger.debug("execute sql:" + sql);
        executeSQL.createTable(sql);
        logger.debug("execute finished!!!");
    }
}