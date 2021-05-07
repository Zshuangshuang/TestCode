package com.zss.dao;

import com.zss.pojo.AppearanceA;
import com.zss.pojo.SkillA;

public interface PersonAAbstractFactory {
    public SkillA createSkillA();
    public AppearanceA createAppearanceA();
}
