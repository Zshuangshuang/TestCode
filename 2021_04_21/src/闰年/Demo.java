package 闰年;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-04-21 9:14
 */
public class Demo {
    public static boolean isRunYear(int year){
        if (year%4 == 0 && year%100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int year = scanner.nextInt();
            System.out.println(isRunYear(year));
        }
    }
}
