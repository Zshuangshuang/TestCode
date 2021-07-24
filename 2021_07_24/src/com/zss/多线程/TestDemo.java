package com.zss.多线程;

class MyThread extends Thread{
    @Override
    public synchronized void start() {
        System.out.println("Hello,我是一个线程");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //new出来时，内核中还未创建PCB
        Thread thread = new MyThread();
        //当执行start方法时，才会真正创建一个线程
        //此时内核中才会出现PCB，这个PCB就会让CPU执行run()中的内容
        thread.start();
    }
}
