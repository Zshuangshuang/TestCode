package com.zss.homework;

import java.util.Scanner;

/*
* 写一个函数返回参数二进制中1的个数比如: 150000 11114个1
 */
public class Demo11 {
    public static int count(int num){
        int count = 0;
        while (num != 0){
            count++;
            num &= (num-1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(count(n));
        }
    }
}
