package 密码登录;

import java.util.Scanner;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 16:05
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的密码:");
        int count = 3;
        while (count > 0){
            String str = scanner.next();
            if (str.equals("123")){
                System.out.println("登陆成功!");
                break;
            }else {
                count--;
                System.out.println("你还有"+count+"次机会输入正确密码");
            }
        }
    }
}
