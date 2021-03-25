package 求三个数字的最大值;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 16:29
 */
public class TestDemo {
    public static int maxOfTwoNums(int n1,int n2){
        return n1>n2 ? n1 : n2;
    }
    public static int maxOfThreeNums(int n1,int n2,int n3){
        int ret = maxOfTwoNums(n1,n2);
        return maxOfTwoNums(ret,n3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(maxOfThreeNums(n1,n2,n3));
    }
}
