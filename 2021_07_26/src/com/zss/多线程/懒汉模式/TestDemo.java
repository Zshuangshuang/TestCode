package com.zss.多线程.懒汉模式;
class Singleton{
    private Singleton(){

    }
    //在需要调用实例Singleton对象的时候在初始化
    private volatile static Singleton singleton;
    public static Singleton getInstance(){
        //由于初始化分为几个步骤：
        //(1)从内存中读取singleton的值
        //(2)与cpu上的singleton作比较看是否为null
        //(3)如果为null，则需要new Singleton实例
        //由于操作非原子性，因此需要加锁来解决线程安全问题
        //但由于频繁加锁开销很大，因此我们使用双重if来优化锁
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
}
