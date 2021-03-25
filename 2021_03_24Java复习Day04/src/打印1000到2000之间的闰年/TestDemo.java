package 打印1000到2000之间的闰年;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 15:36
 */
public class TestDemo {
    public static void display(){
        for (int i = 1000; i <= 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i%400 == 0)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        display();
    }
}
