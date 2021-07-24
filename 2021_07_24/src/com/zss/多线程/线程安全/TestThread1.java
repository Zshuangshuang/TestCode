package com.zss.多线程.线程安全;

class Count{
    public int counter = 0;
    public void increase(){
        counter++;
    }
}
public class TestThread1 {
    public static void main(String[] args)  {
        Count count = new Count();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    count.counter++;
                    System.out.println("t1.count");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    count.counter++;
                    System.out.println("t2.count");
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.counter);
    }
}
