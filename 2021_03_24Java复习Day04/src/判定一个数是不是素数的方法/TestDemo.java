package 判定一个数是不是素数的方法;


import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(isSuNum02(n));
        }
    }

    private static boolean isSuNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n %i == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean isSuNum01(int n){
        int i = 1;
        for ( i = 2; i <= (n/2); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean isSuNum02(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
