package com.zss.review;


import java.util.Scanner;

public class Demo {
    public static int facSum(int num){
        int j = 1;
        int sum = 0;
        int ret = 1;

        int i = 1;
        while(j <= num){
            //求n的阶乘
            i = 1;
            ret = 1;
            while (i <= j){
                ret *= i;
                i++;
            }
            sum += ret;
            j++;
        }

        return sum;
    }
    public static int fac(int num){
        int result = 1;
        int i = 1;
        while (i <= num){
            result *= i;
            i++;
        }
        return result;
    }
    public static int sum(){
        int result = 0;
        int i = 1;
        while (i <= 100){
            result += i;
            i++;
        }
        return result;
    }
    public static void displayOneToTen(){
        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
    }
    public static boolean isLoopYear(int year){
        if (year % 100 == 0 && year % 4 != 0){
            return true;
        }else if (year % 400 == 0){
            return true;
        }
        return false;
    }
    public static boolean isGtZero(int num){
        if (num > 0){
            return true;
        }
        return false;
    }
    public static boolean isOddNum(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       /* int year = scanner.nextInt();
        boolean ret1 = isOddNum(num);
        boolean ret2 = isGtZero(num);
        System.out.println(num+"是否为偶数："+ret1);
        System.out.println(num+"是否大于0："+ret2);
        boolean ret3 = isLoopYear(year);
        System.out.println(year+"是否为闰年："+ret3);*/
        //displayOneToTen();
        //int ret = sum();
        //System.out.println("1-100的和为："+ret);
        int result = fac(num);
        System.out.println(num+"的阶乘为："+result);
        int sum = facSum(num);
        System.out.println("1-"+num+"的阶乘和为："+sum);
    }
}
