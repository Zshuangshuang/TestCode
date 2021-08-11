package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        //加载配置文件也就是加载beams.xml中的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取对象
        //使用id获取对象，默认只能得到一个bean对象，但可以通过其他方式获取多个
        LoginController loginController = (LoginController) context.getBean("loginController");
        System.out.println(loginController);
        //通过class获取只能装配一个bean对象
        LoginService loginService = context.getBean(LoginService.class);
        System.out.println(loginController.getLoginService());
        //获取构造方法注入的bean对象
        System.out.println(loginService.getLoginRepository());
        //验证LoginController依赖注入的LoginService是否为容器中的bean对象
        System.out.println(loginController.getLoginService() == loginService);
        //获取user1对象
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
        //通过@Bean的方式注册了两个user对象，但是由class(类型)获取Bean对象只能是Bean对象唯一，
        // 多个同一类型的Bean对象不能由类型获取，只能让通过id(这里就是方法名称)来获取
       /* User user2 = context.getBean(User.class);
        System.out.println(user2);*/
        AppConfig config = context.getBean(AppConfig.class);
        System.out.println(config);
        //获取采用实现FactoryBean接口的User对象
        User user3 = (User)context.getBean("byFactoryBean");
        System.out.println(user3);
        //获取工厂对象:加上&
        FactoryBean factoryBean = (FactoryBean) context.getBean("&byFactoryBean");
        System.out.println(factoryBean);

        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}