package com.zss.pojo;


import com.zss.dao.PersonBAbstractFactory;

public class PersonB implements PersonBAbstractFactory {
    @Override
    public SkillB createSkillB() {
        return new SkillB();
    }

    @Override
    public AppearanceB createAppearanceB() {
        return new AppearanceB();
    }
}
