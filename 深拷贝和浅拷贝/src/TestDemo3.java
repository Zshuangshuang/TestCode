/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-10 10:15
 */
public class TestDemo3 {
    public static void main(String[] args) {
        int a = 888;
        //装箱
        Integer x = Integer.valueOf(a);
        System.out.println(x.equals(a));
        Integer m = 999;
        Integer n = 999;
        System.out.println(m == n);
        //拆箱
        int c = x.intValue();
        System.out.println(c == a);
    }
}
