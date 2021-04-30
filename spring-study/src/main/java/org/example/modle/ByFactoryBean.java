package org.example.modle;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


@Component
public class ByFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("喵喵");
        user.setPassword("123");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
