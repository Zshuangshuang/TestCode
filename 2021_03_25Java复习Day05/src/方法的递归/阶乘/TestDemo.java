package 方法的递归.阶乘;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-25 9:51
 */
public class TestDemo {
    private static int fac(int n){
        if (n == 1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
}
