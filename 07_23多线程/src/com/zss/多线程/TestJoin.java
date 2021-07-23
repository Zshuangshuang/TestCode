package com.zss.多线程;

class MyJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Thread"+i);
        }
    }
}
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        MyJoin join = new MyJoin();
        Thread thread = new Thread(join);
        thread.start();
        //主线程
        for (int i = 0; i < 1000; i++) {
            if (i == 200){
                System.out.println("主线程被阻塞");
                thread.join();
            }
            System.out.println("主线程"+i);
        }
    }
}
