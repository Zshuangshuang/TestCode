package javabaseTest;

import java.util.Scanner;

/**
 *
 * 打印三角形
 * */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的行数");
        int n = scanner.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("*");
            }
            for (int m = 1; m < row; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
