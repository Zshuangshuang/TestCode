package org.example.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-08-02 21:35
 */
public class DBUtilTest {
    @Test
    public  void test(){
       Connection connection =  DBUtil.getConnection();
        Assert.assertNotNull(connection);
    }

}
