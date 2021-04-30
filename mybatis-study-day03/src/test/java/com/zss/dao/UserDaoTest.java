package com.zss.dao;

import com.zss.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    SqlSession sqlSession;
    UserDao userDao;
    @Before
    public void start() throws IOException {
    //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
    //2.创建SqlSessionFactory实例
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    //3.创建sqlSession实例
       sqlSession = factory.openSession();
   //4.创建代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }
    @After
    public void end() throws IOException {
        sqlSession.close();
    }
    //查询所有用户
    @Test
    public void findAll()  {
        List<User> userList = userDao.findAll();
        for (User user:userList){
            System.out.println(user);
        }
    }
    @Test
    //添加用户
    public void addUser(){
        User user = new User(4,"凡凡子","456");
        int ret = userDao.addUser(user);
        //进行添加操作需要提交事务
        sqlSession.commit();
        System.out.println(ret);
    }
    @Test
    public void deleteUser(){
        int ret = userDao.deleteUser(1);
        //删除操作需要提交事务
        sqlSession.commit();
        System.out.println(ret);
    }
    @Test
    public void updateUser(){
        User user = new User(2,"xyf","wxnl");
        int ret = userDao.updateUser(user);
        //修改操作需要提交事务
        sqlSession.commit();
        System.out.println(ret);
    }
    @Test
    public void findById(){
        User user = userDao.findById(4);
        System.out.println(user);
    }
    @Test
    public void getUserLike(){
        List<User> userList = userDao.getUserLike("%凡%");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
