package 返回二进制中1的个数;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 16:11
 */
public class TestDemo {
    private static int countNumsOfOne(int n){
        int count = 0;
        while (n != 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countNumsOfOne(n));
    }
}
