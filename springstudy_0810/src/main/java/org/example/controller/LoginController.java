package org.example.controller;

import lombok.Getter;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

//加上注解将bean对象注册到Spring容器中去
//注册一个id为类名首字母小写的bean对象
@Controller
@Getter

public class LoginController {
    //加上注解装配Bean对象的属性,属性注入
    @Autowired
    private LoginService loginService;
    @Autowired
    private User user1;

    @Autowired
    @Qualifier("user2")
    private User kkk;
    @Bean
    public User user1(){
        User user = new User();
        user.setName("双双");
        user.setPassword("hard-work");
        return user;
    }
    @Bean
    public User user2(){
        User user = new User();
        user.setName("阿凡");
        user.setPassword("must-pass");
        return user;
    }
    @Bean
    public User user5(User user2){
        System.out.println("user3中打印的user2："+user2);
        User user = new User();
        user.setName("菲菲公主");
        user.setPassword("王者");
        return user;
    }
}
