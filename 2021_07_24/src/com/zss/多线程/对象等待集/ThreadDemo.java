package com.zss.多线程.对象等待集;


import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (locker){
                    while (true){
                        try {
                            System.out.println("wait开始(wait释放锁)");
                            locker.wait();
                            System.out.println("wait结束，wait已经重新获取到锁，并且执行完毕");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个值，notify要开始执行了");
                int n = scanner.nextInt();
                /**
                 * notify 也必须要在synchronized关键字包裹的代码块中
                 * notify与wait以及synchronized的锁对象都是同一个
                 * */
                synchronized (locker){
                    System.out.println("notify执行前");
                    locker.notify();
                    System.out.println("notify执行后");
                }
            }
        };
        t2.start();
    }
}
