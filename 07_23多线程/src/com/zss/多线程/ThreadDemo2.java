package com.zss.多线程;

public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }

    public static void main(String[] args) {
        //Runnable是接口不能实例化对象
        //需要通过Thread代理来调用start()
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
       /* Thread thread = new Thread(runnable);
        thread.start();*/
        new Thread(threadDemo2).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我要专心好好学习"+i);
        }
    }
}
