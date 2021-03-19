package javabaseTest;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-19 0:42
 */
public class TestDemo2 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 1000; i++) {
            if(i % 5 == 0){
                if (count %4 != 0){
                    System.out.print(i+"\t");
                    count++;
                }else {
                    System.out.println();
                    count++;
                }
            }
        }
    }
}
