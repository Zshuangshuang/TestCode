package com.zss.dao.impl;

import com.zss.dao.IUserDao;
import com.zss.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpI implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpI(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        //1.使用工厂创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2.使用sqlSession执行查询语句
        //3.返回查询结果
        List<User> users = sqlSession.selectList("com.zss.dao.IUserDao.findAll");
        //4.关闭资源
        sqlSession.close();
        return users;
    }
}
