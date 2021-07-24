package com.zss.多线程;


public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //这里当执行interrupt方法可以感知到，并且会修改标记位的值，将其由true重置为false
                    //System.out.println(Thread.interrupted());
                    //仅仅只是感知，并不会修改标记位的值，始终为true
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        };
        thread1.start();
        thread1.interrupt();
    }
}
