package com.zss.homework;

import java.util.Random;
import java.util.Scanner;

public class Demo14 {
    public static void game(){
        Random random = new Random();
        int ranNum = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要猜的数字: ");
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            if (num < ranNum){
                System.out.println("猜小了");
            }else if (num == ranNum){
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜大了");
            }
        }

    }
    public static void main(String[] args) {
        game();
    }
}
