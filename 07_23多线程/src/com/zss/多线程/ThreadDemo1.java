package com.zss.多线程;

/**
 * 线程开启不定立即执行，线程的执行是由CPU进行调度的
 * 单核CPU的主机在某一时刻只能做一件事情
 * */
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo = new ThreadDemo1();
        threadDemo.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在准备秋招"+i);
        }
    }
}
