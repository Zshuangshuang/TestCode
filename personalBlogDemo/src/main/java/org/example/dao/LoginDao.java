package org.example.dao;

import org.example.exception.AppException;
import org.example.model.User;
import org.example.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public static User query(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "select id,username,password from user where username=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1,username);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
        }catch (Exception e){
            throw new AppException("Log001","查询用户操作失败",e);
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return user;
    }
}
