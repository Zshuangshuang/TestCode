package org.example.controller;

import lombok.Getter;
import org.example.modle.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
@Getter
//@Controller的含义是注册一个id为类的首字母小写的bean对象
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private User user1;

    @Autowired
    @Qualifier("user2")
    private User user;

    @Bean
    public User user1(){
        User u = new User();
       u.setUsername("凡凡子");
       u.setPassword("xni");
       return u;
    }
    @Bean
    public  User user2(){
        User user = new User();
        user.setUsername("双双");
        user.setPassword("zyq");
        return user;
    }
    @Bean
    public  User user3(User user2){
        System.out.println(user2);
        User user = new User();
        user.setUsername("bhjknjn");
        user.setPassword("23456y");
        return user;
    }
}
