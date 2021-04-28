package com.zss.test;


import com.zss.dao.IUserDao;
import com.zss.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBaitsTest {
    /*
    * 测试查询所有的操作
    * */
    @Test
    public void testFindAll() throws IOException {
        //1.读取配置文件，生成字节输入流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //4.获取dao的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        //5.执行查询所有的操作
        List<User> users = userDao.findAll();
        for (User user : users){
            System.out.println(user);
        }
        //6.关闭资源
        sqlSession.close();
        in.close();
    }
}
