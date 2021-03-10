class Teacher implements Cloneable{
    private int age;
    private String name;
    private char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[Teacher: " + this.hashCode()  + ",name:" + name + ",age:" + age + ",sex:"+sex+"]";
    }
}
public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher1 = new Teacher();
        teacher1.setAge(45);
        teacher1.setName("李四");
        teacher1.setSex('男');
        Teacher teacher2 = (Teacher) teacher1.clone();
        teacher2.setSex('女');
        teacher2.setName("菜菜");
        teacher2.setAge(30);
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}
