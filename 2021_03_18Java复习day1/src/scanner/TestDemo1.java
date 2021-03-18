package scanner;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-18 22:42
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收: ");
        //判断用户是否输入
        if(scanner.hasNext()){
            //使用next方式接收内容
            String str = scanner.next();
            System.out.println("输出的内容str: "+str);
        }
        //关闭资源，凡是使用IO流泪的类，如果不关闭会一直占用资源，可能会造成内存泄漏
        scanner.close();

    }
}
