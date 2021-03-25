package 输出一个数字的每一位;

import java.util.Scanner;


public class TestDemo {
    private static void display(int n){
        if (n >= 0 && n < 10){
            System.out.println(n);
        }
        while (n != 0){
            System.out.print(n%10+" ");
            n = n/10;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        display(n);

    }
}
