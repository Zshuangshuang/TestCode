package com.zss.多线程;


public class ThreadDemo1 {
    public static long num = 100_0000_0000L;
    public static void serial(){
        long beg = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < num; i++) {
            a++;
        }
        int b = 0;
        for (long j = 0; j < num; j++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("运行时间："+(end-beg)+"ms");
    }
    public static void main(String[] args) {
        //serial();
        currency();
    }

    public static void currency() {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < num; i++) {
                    a++;
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < num; i++) {
                    a++;
                }
            }
        };
        long beg = System.currentTimeMillis();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       long end = System.currentTimeMillis();
        System.out.println("执行时间"+(end-beg)+"ms");
    }
}
