package 方法的重载;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-25 9:29
 */
public class TestDemo {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }
}
