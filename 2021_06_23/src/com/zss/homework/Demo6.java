package com.zss.homework;

import java.util.Scanner;

/*
* 求两个正整数的最大公约数
 * */
public class Demo6 {
    public static int getComment(int a,int b){
        int ret = a % b;
        while (ret != 0){
            a = b;
            b = ret;
            ret = a % b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ret = getComment(a,b);
            System.out.println(a+","+b+"的最大公约数为："+ret);
        }
    }
}
