package com.zss.dao;

import com.zss.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserTest {
    static Logger logger = Logger.getLogger(UserTest.class);
    @Test
    public void findById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findById(1));
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("info:进入log4j");
        logger.debug("debug:进入log4j");
        logger.error("error:进入log4j");
    }

}
