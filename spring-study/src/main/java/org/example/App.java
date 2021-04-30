package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.modle.User;
import org.example.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        LoginController controller = (LoginController) context.getBean("loginController");
        System.out.println(controller);
        System.out.println(controller.getLoginService());
       //验证loginController依赖注入的loginService是不是容器中的Bean对象
        LoginService loginService = context.getBean(LoginService.class);
        System.out.println(controller.getLoginService() == loginService);

        User user = (User)context.getBean("user1");
        System.out.println(user);
        User user2 = (User)context.getBean("user2");
        System.out.println(user2);

        AppConfig config = context.getBean(AppConfig.class);
        System.out.println(config);

        User user3 = (User)context.getBean("byFactoryBean");
        System.out.println(user3);



        System.out.println(loginService.getLoginRepository());
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}