package com.zss.多线程.饿汉模式;

class Singleton{
    //设计为私有的就不能再类外实例化对象
    private Singleton(){

    }
    //在类加载的时候就初始化,设计为static保证它仅有一份
    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

    }
}
