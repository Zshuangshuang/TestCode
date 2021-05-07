import com.zss.pojo.PersonA;
import com.zss.pojo.PersonB;


public class TestDemo {
    public static void main(String[] args) {
        //人物A
        PersonA A = new PersonA();
        //人物A的技能
        A.createSkillA();
        //人物A的外观
        A.createAppearanceA();
        //人物B
        PersonB B = new PersonB();
        //人物B的技能
        B.createSkillB();
        //人物B的外观
        B.createAppearanceB();

    }
}
