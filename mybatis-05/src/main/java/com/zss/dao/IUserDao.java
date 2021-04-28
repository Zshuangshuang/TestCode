package com.zss.dao;

import com.zss.domain.User;

import java.util.List;

/**
 * 用户持久层接口*/
public interface IUserDao {
    /**
     * 查询所有用户
     * */
    List<User> findAll();
}
