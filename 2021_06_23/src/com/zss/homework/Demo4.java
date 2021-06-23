package com.zss.homework;
/**
 * 输出1000 - 2000之间所有的闰年
 * */
public class Demo4 {
    public static void show(){
        for (int i = 1000; i <= 2000; i++) {
            if (i % 4 == 0 && i % 100 != 0){
                System.out.print(i+" ");
            }
            if (i % 400 == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        show();
    }
}
