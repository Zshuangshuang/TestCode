package com.zss.homework;

import java.util.Scanner;

/*
* 输出一个整数的每一位.
 */
public class Demo13 {
    public static void show(int num){
        while (num != 0){
            int ret = num % 10;
            System.out.print(ret+" ");
            num = num / 10;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            show(num);
        }
    }
}
