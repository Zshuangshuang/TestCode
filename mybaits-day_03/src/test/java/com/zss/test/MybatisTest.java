package com.zss.test;


import com.zss.dao.IUserDao;
import com.zss.dao.impl.UserDaoImpI;
import com.zss.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * myBaits入门
 * */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
       IUserDao userDao = new UserDaoImpI(factory);

        //5.使用对象执行方法
        List<User> userList = userDao.findAll();
        for (User user : userList){
            System.out.println(user);
        }
        in.close();
    }
}
