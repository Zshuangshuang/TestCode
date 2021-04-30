package com.zss.dao;


import com.zss.pojo.User;
import com.zss.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    SqlSession sqlSession;
    UserMapper mapper;
    @Before
    public void testStart(){
        //获取sqlSession对象
        sqlSession =  MybatisUtils.getSqlSession();
        //执行sql
         mapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void testEnd(){
        sqlSession.close();
    }
    @Test
    public void test(){
        List<User> userList = mapper.getUserList();
        for (User user : userList){
            System.out.println(user);
        }

    }
    @Test
    public void getUserById(){
        User user = mapper.getUserById(1);
        System.out.println(user);

    }
    //增删改需要提交事务
    @Test
    public void addUser(){
        User user = new User("凡凡子","12345");
        int result = mapper.addUser(user);
        sqlSession.commit();
        System.out.println(result);
    }
   
}
