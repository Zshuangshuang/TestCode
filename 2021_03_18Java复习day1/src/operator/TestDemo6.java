package operator;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-18 22:25
 */
public class TestDemo6 {
    public static void main(String[] args) {
        /**
         * A = 0011 1100
         * B = 0000 1101
         *
         * ==============
         * A&B=0000 1100
         * A|B=0011 1101
         * A^B=0011 0001
         * ~B=1111 0010
         * */
        //System.out.println(2<<3);
        /**
         * <<:左移相当于x2
         * >>:右移相当于÷2
         * */
        System.out.println((-1>>>4));
    }
}
