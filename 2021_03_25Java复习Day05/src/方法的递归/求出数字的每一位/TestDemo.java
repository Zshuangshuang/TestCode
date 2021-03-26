package 方法的递归.求出数字的每一位;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-25 9:57
 */
public class TestDemo {
    public static void display(int n){
       if (n > 9){
           display(n/10);
       }
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        display(n);
    }
}
