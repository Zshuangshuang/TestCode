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
import java.util.List;

public class UserDaoTest {
    InputStream in;
    SqlSession sqlSession;
    UserMapper mapper;
    @Before
    public void start() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.获取factory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取sqlSession对象
        sqlSession = factory.openSession();
        //4.创建代理对象
       mapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void end()  {
        sqlSession.close();

    }
    @Test
    public void findAll(){
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
