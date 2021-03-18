package base;

public class TestDemo1 {
    //实例变量:从属于这个类,如果不初始化，就是默认值
    String name;
    int age;

    public static void main(String[] args) {
        //局部变量必须声明和初始化,生命周期就是花括号的作用域
        TestDemo1 testDemo1 = new TestDemo1();
        System.out.println(testDemo1.name);
    }
}
