package com.zss.单例模式.饿汉模式;

class Singleton{
    //将构造方法设置为private，使得在类外无法访问
    private Singleton() {
    }
    //将实例设置为static,有且仅有一份
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //无法被new
        //Singleton singleton = new Singleton();
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}