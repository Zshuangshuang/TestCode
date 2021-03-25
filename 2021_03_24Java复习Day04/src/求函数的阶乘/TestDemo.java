package 求函数的阶乘;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 16:41
 */
public class TestDemo {
    private static int fac(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int ret = 1;
            for (int j = 1; j <= 1; j++) {
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
