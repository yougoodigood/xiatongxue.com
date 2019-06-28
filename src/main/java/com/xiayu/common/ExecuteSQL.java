package com.xiayu.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class ExecuteSQL {
    @Value("${database.driver}")
    private String driver;
    @Value("${database.url}")
    private String url;
    @Value("${database.user}")
    private String user;
    @Value("${database.password}")
    private String password;

    private Connection connection;

    private Statement statement;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void createTable(String sql) {
        try{
            Class.forName(this.driver);
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){
            logger.info("excute sql exception:" + e);
        }finally {
            shutDown(statement,connection);
        }

    }

    public int executeDmlAndDdl(String sql){
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            return statement.executeUpdate(sql);
        }catch (Exception e){

        }finally {
            shutDown(statement,connection);
        }
        return 0;
    }

    private void shutDown(Statement statement,Connection connection){
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
