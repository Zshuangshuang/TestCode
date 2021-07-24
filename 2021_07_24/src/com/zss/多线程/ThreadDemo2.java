package com.zss.多线程;


public class ThreadDemo2 {
   static boolean flg = true;
    public static void main(String[] args) {


        Thread t = new Thread(){
            @Override
            public void run() {
                while (flg){
                    System.out.println("正在转账中");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("网络异常");
        flg = false;
        System.out.println("转账结束");
    }
}
