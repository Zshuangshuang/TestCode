package com.ssz.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBaitsUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        String resource = "mybaits.config.xml";
        try {
            //使用MyBaits获取sqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取sqlSessionFactory对象
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }


}
