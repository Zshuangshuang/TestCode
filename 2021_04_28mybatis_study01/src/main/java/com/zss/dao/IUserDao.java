package com.zss.dao;

import com.zss.domain.User;
import java.util.List;
/*
* 用户持久层接口
* */
public interface IUserDao {
    /*
    * 查询所有用户
    * */
    List<User> findAll();
    /*
    * 保存用户
    * */
    void saveUser(User user);
    /**
     * 更新用户
     * */
    void updateUser(User user);
    /*
    * 删除用户
    * */
    void deleteUser(Integer userId);
    //根据id查询用户信息
    User findById(Integer userId);
    //根据姓名模糊查询信息
    List<User> findByName(String userName);
    //查询总用户数
    int findTotal();
}
