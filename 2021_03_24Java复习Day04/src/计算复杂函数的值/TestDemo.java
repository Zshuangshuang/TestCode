package 计算复杂函数的值;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 15:55
 */
public class TestDemo {
    private static double sum(){
        double result = 0;
        int flag = 1;
        for (int i = 1; i <= 100; i++) {
            result += (1*1.0/i*flag);
            flag = -flag;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}
