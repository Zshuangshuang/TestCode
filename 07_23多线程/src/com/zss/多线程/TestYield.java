package com.zss.多线程;

class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"执行完毕");
    }
}
public class TestYield {
    public static void main(String[] args) {
        MyYield yield = new MyYield();
        new Thread(yield,"A").start();
        new Thread(yield,"B").start();
    }
}
