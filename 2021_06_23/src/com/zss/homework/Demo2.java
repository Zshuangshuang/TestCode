package com.zss.homework;

import java.util.Scanner;

/*
* 2.判定一个数字是否是素数
 * */
public class Demo2 {
    public static boolean isOdd(int num){
        if (num <= 0){
            return false;
        }
        if (num == 1){
            return false;
        }
        int i = 0;
        for ( i = 2; i <= num/2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        if (i > num/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            boolean ret = isOdd(n);
            System.out.println(ret);
        }
    }
}
