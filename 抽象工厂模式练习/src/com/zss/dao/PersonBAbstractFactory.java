package com.zss.dao;

import com.zss.pojo.AppearanceB;
import com.zss.pojo.SkillB;

public interface PersonBAbstractFactory {
   public SkillB createSkillB();
   public AppearanceB createAppearanceB();
}
