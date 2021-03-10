class Student {
    private int age;
    private char sex;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "[Student: " + this.hashCode()  + ",name:" + name + ",age:" + age + "]";
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.setAge(20);
        studentA.setName("邹双双");
        studentA.setSex('女');
        //浅拷贝
        Student studentB = studentA;
        studentB.setAge(21);
        studentB.setSex('男');
        studentB.setName("张三");
        System.out.println("StudentA:"+ studentA);
        System.out.println("studentB："+ studentB);
    }
}
