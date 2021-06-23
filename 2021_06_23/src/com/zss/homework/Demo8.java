package com.zss.homework;

/*
* 编写程序数一下1到100的所有整数中出现多少个数字9
 */
public class Demo8 {
    public static int count(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9){
                count++;
            }
            if (i / 10 == 9){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
