package com.zss.单例模式.懒汉模式;
class Singleton{
    private Singleton(){

    }
    //没有在类加载的过程中实例化对象
    //而是在调用getInstance方法的时候生成对象，并且只会生成一次，节省了许多资源
    //也称之为延时加载
    //线程不安全
    private static volatile Singleton singleton = null;
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
