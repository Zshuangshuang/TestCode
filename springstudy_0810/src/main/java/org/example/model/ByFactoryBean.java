package org.example.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ByFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("小鲁班");
        user.setPassword("真开心");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
