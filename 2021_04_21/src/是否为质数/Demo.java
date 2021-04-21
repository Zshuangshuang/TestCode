package 是否为质数;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-04-21 9:58
 */
public class Demo {
    public static boolean isSingle(int num){
        int i = 0;
        for (i = 2; i <= (num/2); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSingle(20));
    }
}
