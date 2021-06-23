package com.zss.review;

import java.util.Scanner;

public class Demo2 {
    public static int maxNum(int num1,int num2,int num3){
        int max = maxNum(num1,num2);
        return maxNum(max,num3);
    }
    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("三者中的最大值为："+maxNum(num1,num2,num3));
    }
}
