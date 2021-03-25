package 打印1到100间的素数;



/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-03-24 15:27
 */
public class TestDemo {
    public static void display(){
        for (int i = 1; i <= 100; i++) {
            int j;
            for ( j = 2; j <=(i/2) ; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j >= (i/2)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        display();
    }
}
