package 求两个数的最大公约数;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 15:42
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(MaxNumOfYue(n1,n2));
        }
    }

    private static int MaxNumOfYue(int n1, int n2) {
        int tmp = n1%n2;
        while (tmp != 0){
            n1 = n2;
            n2 = tmp;
            tmp = n1%n2;
        }
        return n2;
    }


}
