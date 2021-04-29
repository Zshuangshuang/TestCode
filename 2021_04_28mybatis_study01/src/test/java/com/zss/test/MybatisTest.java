package com.zss.test;

import com.zss.dao.IUserDao;
import com.zss.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {
   private InputStream in;
   private SqlSession sqlSession;
   private IUserDao userDao;
   @Before//用于在测试方法之前执行
   public void init() throws Exception {
      //1.读取配置文件生成自己输入流
       in = Resources.getResourceAsStream("SqlMapConfig.xml");
      //2.获取SqlSessionFactory对象
      SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
      //3.获取SqlSession对象
       sqlSession = factory.openSession();
      //4.获取dao的代理对象
       userDao = sqlSession.getMapper(IUserDao.class);
   }
   @After //用于在执行测试方法之后运行
   public void destroy() throws Exception {
      sqlSession.close();
      in.close();
   }
   @Test
    public void testFindAll()  {
       //5.执行查询所有的方法
       List<User> users = userDao.findAll();
       for (User user : users){
           System.out.println(user);
       }

   }
   @Test
   public void testSave()  {
      User user = new User();
      user.setUsername("嘻哈");
      user.setAddress("三亚");
      user.setSex("女");
      user.setBirthday(new Date());
      //5.执行保存方法
     userDao.saveUser(user);
     //6.提交事务
      sqlSession.commit();
   }
   @Test //测试更新操作
    public void testUpdate(){
       User user = new User();
       user.setId(2);
       user.setUsername("凡凡子");
       user.setAddress("西安");
       user.setSex("男");
       user.setBirthday(new Date());
       //执行更新操作
       userDao.updateUser(user);
       sqlSession.commit();
   }
   @Test //测试删除用户
    public void testDelete(){
     userDao.deleteUser(1);
     sqlSession.commit();
   }
   @Test
    public void testFindByUser(){
       User user = userDao.findById(2);
       System.out.println(user);
   }
   @Test
    public void testFindByName(){
       List<User> users = userDao.findByName("%凡%");
       for (User user : users){
           System.out.println(user);
       }
   }
   @Test
    public void testFindTotal(){
       int total = userDao.findTotal();
       System.out.println(total);
   }

}
