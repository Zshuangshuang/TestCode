package com.zss.多线程;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void tenDown() throws InterruptedException {
        int time = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println("倒计时："+time--);
            if (time < 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        /*try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Date startTime = new Date(System.currentTimeMillis());
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
