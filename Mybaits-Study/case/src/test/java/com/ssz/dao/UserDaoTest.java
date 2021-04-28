package com.ssz.dao;

import com.ssz.pojo.User;
import com.ssz.utils.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获取sqlSession对象
        SqlSession sqlSession =  MyBaitsUtils.getSqlSession();
        //getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }

}
