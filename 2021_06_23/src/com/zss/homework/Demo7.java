package com.zss.homework;

/*
* 计算1/1-1/2+1/3-1/4+1/5.......+ 1/99 - 1/100的值。
 */
public class Demo7 {
    public static double sum(){
        int flg = 1;
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            sum += (1.0/i)*flg;
            flg = -flg;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}
