package com.zss.dao;


import com.zss.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询全部的用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //增加用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
}
