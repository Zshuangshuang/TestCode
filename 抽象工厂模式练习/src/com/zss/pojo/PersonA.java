package com.zss.pojo;

import com.zss.dao.PersonAAbstractFactory;

public class PersonA implements PersonAAbstractFactory {
    @Override
    public SkillA createSkillA() {
        return new SkillA();
    }

    @Override
    public AppearanceA createAppearanceA() {
        return new AppearanceA();
    }
}
