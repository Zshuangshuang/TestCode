package com.zss.多线程;

/**
 * 模拟抢火车票
 * 发现在同一时刻使用某一种资源，会出现线程不安全的问题
 * */
public class ThreadDemo3 implements Runnable{
    private int tickets = 10;
    @Override
    public void run() {

        while (true){
            if (tickets < 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+tickets--+"张票");
        }
    }

    public static void main(String[] args) {
        ThreadDemo3 runnable = new ThreadDemo3();

        new Thread(runnable,"双双").start();
        new Thread(runnable,"邓庄主").start();
        new Thread(runnable,"小短腿").start();
    }
}
