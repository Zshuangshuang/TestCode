package struct;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-18 23:45
 */
public class DoWhileDemo2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0){
            a++;
            System.out.println("a1: "+a);

        }
        System.out.println("======================");
        do {
            a++;
            System.out.println("a2: "+a);
        }while (a < 0);
    }
}
