package com.zss.多线程;


public class ThreadDemo4 implements Runnable{
    boolean flg = true;
    @Override
    public void run() {
        int i = 0;
        while (flg){
            System.out.println("Thread正在运行"+i++);
        }
    }
    public void stop(){
        this.flg = false;
    }

    public static void main(String[] args) {
        ThreadDemo4 threadDemo4 = new ThreadDemo4();
        new Thread(threadDemo4);
        for (int i = 0; i <= 1000; i++) {
            System.out.println("main"+i);
            if (i == 900){
                threadDemo4.stop();
                System.out.println("线程停止了");
            }
        }
    }
}
