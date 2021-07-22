package com.zss.JDBC编程;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestDemo {
    public static void main(String[] args) throws SQLException {
        //1.创建DataSource对象
        DataSource dataSource = new MysqlDataSource();
        String url = "jdbc:mysql://127.0.0.1:3306/test?character=utf-8&useSSL=false";
        String user = "root";
        String password = "261919Zss";
        ((MysqlDataSource)dataSource).setURL(url);
        ((MysqlDataSource)dataSource).setUser(user);
        ((MysqlDataSource)dataSource).setPassword(password);
        //2.建立数据库连接
        Connection connection = dataSource.getConnection();
        //3.拼装sql语句
        String sql = "insert into student values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,1);
        statement.setString(2,"张三");
        statement.setInt(3,2);
        System.out.println(statement);
        //4.执行sql语句
        int ret = statement.executeUpdate();
        if (ret == 1){
            System.out.println("执行成功");
        }
        //5.释放资源
        statement.close();
        connection.close();
    }
}
