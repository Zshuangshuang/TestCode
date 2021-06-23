package com.zss.homework;

import java.util.Scanner;

/**
 *
 编写代码模拟三次密码输入的场景。
 最多能输入三次密码，密码正确，提示"登录成功",密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
 */
public class Demo10 {
    public static void show(){
        int time = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要设置的密码");
        String str = scanner.next();
        while (time > 0){
            System.out.println("请输入密码：");
            String password = scanner.next();
            if (password.equals(str)){
                System.out.println("密码正确，登陆成功!");
                break;
            }else {
                time--;
                System.out.println("你还有"+time+"次机会输入密码");
            }
        }
    }
    public static void main(String[] args) {
        show();
    }
}
