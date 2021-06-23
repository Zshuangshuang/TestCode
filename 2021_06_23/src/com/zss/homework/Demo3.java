package com.zss.homework;

/**
 * 打印1-100之间所有的素数
 * */
public class Demo3 {
    public static void show(){
        for (int i = 2; i <= 100; i++) {
            int j = 0;
            for ( j = 2; j <= i/2; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j > i/2){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        show();
    }
}
