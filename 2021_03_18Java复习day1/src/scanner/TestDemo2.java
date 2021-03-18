package scanner;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-18 22:47
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("使用nextLine接收数据: "+str);
        }
        scanner.close();
    }
}
