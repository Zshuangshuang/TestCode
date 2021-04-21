package 九九乘法表;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-04-21 8:31
 */
public class Demo {
    public static void display(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        display();
    }
}
