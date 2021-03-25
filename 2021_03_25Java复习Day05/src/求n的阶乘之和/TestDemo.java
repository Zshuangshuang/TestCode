package 求n的阶乘之和;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-25 9:11
 */
public class TestDemo {
    private static int fac(int num){
        int result = 0;
        for (int i = 1; i <= num; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            result += ret;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(fac(n));
        }
    }
}
