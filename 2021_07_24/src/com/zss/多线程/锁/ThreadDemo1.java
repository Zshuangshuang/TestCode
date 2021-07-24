package com.zss.多线程.锁;


import java.util.Scanner;

public class ThreadDemo1 {
    private static Object locker = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                synchronized (locker){
                    System.out.println("请输入一个数字");
                    int num = scanner.nextInt();
                    System.out.println("num = "+num);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
               while (true){
                   synchronized (locker){
                       System.out.println("线程2获取到锁");
                   }
               }
            }
        };
        t2.start();
    }
}
