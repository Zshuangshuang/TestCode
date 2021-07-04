/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-07-04 8:58
 */
class Base{
    public String name;
    public int age;

    public Base(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Base(){
        System.out.println("Base无参构造方法");
    }
    {
        System.out.println("Base实例代码块");
    }
    static {
        System.out.println("Base的静态代码块");
    }
}
class Son extends Base{
    public String nickName;
    static {
        System.out.println("Son的静态代码块");
    }
    {
        System.out.println("Son的实例代码块");
    }

    public Son() {
        System.out.println("Son的构造方法");
    }

    public Son(String nickName) {
        this.nickName = nickName;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
