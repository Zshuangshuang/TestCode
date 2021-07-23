package com.zss.多线程;


public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Hello");
        });


        Thread.State state = thread.getState();
        System.out.println("新建状态："+state);
        thread.start();
        state = thread.getState();
        System.out.println("运行状态："+state);
        while (thread.getState() != Thread.State.TERMINATED){
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                state = thread.getState();
                System.out.println("等待时间："+state);
            }

        }
    }
}
