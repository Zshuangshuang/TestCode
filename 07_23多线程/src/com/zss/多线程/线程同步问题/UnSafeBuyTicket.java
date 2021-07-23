package com.zss.多线程.线程同步问题;
/**
 * 线程不安全
 * */
class BuyTicket implements Runnable{
    private int ticketNums = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while(flag){
            buy();
        }
    }

    private void buy() {
        if (ticketNums <= 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNums--+"张票");
    }
}
public class UnSafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();
        new Thread(station,"双双").start();
        new Thread(station,"凡凡子").start();
        new Thread(station,"蔡蔡").start();
    }
}
