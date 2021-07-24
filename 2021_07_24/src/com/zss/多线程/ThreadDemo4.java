package com.zss.多线程;


public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("我是线程1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("我是线程2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        System.out.println("主线程执行");
        t1.start();
        t1.join();//此时会等待线程1执行结束，当线程1执行结束才会去执行后面的语句
        t2.start();
        t2.join();
    }
}
