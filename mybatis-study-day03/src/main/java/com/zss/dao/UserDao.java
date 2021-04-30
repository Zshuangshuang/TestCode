package com.zss.dao;

import com.zss.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
//查询表中所有的用户
    List<User> findAll();
//添加用户操作
    int addUser(User user);
//删除用户操作
    int deleteUser(int id);
//修改用户操作
    int updateUser(User user);
//根据id查找用户
    User findById(int id);
//模糊查询
   List<User> getUserLike(String value);
}
