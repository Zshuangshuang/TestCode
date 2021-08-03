package org.example.util;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.example.exception.AppException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/servlet_blog?user=root&password=261919Zss&character=utf-8&useSSL=false";
    //创建连接池对象，提高效率；避免每次都要创建和释放数据库操作对象
    private static final DataSource DS = new MysqlDataSource();
    static {
        ((MysqlDataSource) DS).setURL(URL);
    }
    //获取Connection对象
    public static Connection getConnection(){
        try {
            return DS.getConnection();
        } catch (SQLException e) {
            //返回自定义异常
           throw new AppException("DBError001","数据库连接异常",e);
        }
    }


    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if (resultSet != null){
                resultSet.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new AppException("DBError002","数据库关闭资源失败",e);
        }
    }
    public static void close(Connection connection, PreparedStatement statement){
        close(connection, statement,null);
    }
}
