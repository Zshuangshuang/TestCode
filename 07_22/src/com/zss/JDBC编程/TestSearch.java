package com.zss.JDBC编程;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSearch {
    public static void main(String[] args) throws SQLException {
        //1.建立数据库连接,创建datasource对象
        DataSource dataSource = new MysqlDataSource();
        String url = "jdbc:mysql://127.0.0.1:3306/test?character=utf-8&useSSL=false";
        String user = "root";
        String password = "261919Zss";
        ((MysqlDataSource)dataSource).setURL(url);
        ((MysqlDataSource)dataSource).setUser(user);
        ((MysqlDataSource)dataSource).setPassword(password);
        //2.创建Connection对象
        Connection connection = dataSource.getConnection();
        //3.创建preparedStatement对象
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        //4.建立结果集
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int classId = resultSet.getInt("class_id");
            System.out.println("学号："+id+" 姓名："+name+" 班级号："+classId);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
