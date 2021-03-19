package javabaseTest;

/**
 * 找出101-150之间的质数
 *
 * */
public class TestDemo1 {
    public static void main(String[] args) {
        for (int i = 101; i <= 150; i++) {
            int j = 0;
            for ( j = 2; j < i/2; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j >= i/2){
                System.out.print(i+" ");
            }
        }
    }
}
