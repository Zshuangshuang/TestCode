package com.zss.dao;

import com.zss.domain.User;

import java.util.List;

//用户持久层接口
/**
* 查询所有操作
* */
public interface IUserDao {
    List<User> findAll();
}
