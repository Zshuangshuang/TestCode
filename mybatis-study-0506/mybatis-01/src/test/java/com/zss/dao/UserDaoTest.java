package com.zss.dao;


import com.zss.pojo.User;
import com.zss.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();;
        try{
            //执行sql方式1：getMapper
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> users = userDao.getUserList();
            for (User user : users){
                System.out.println(user);
            }
        }catch (Exception e){
           e.printStackTrace();

        }finally {
            //关闭sqlSession
            sqlSession.close();
        }

    }
}
