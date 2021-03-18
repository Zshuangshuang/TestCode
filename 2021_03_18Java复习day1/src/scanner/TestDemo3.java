package scanner;


import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据: ");
        int a  = scanner.nextInt();
        String str = scanner.nextLine();
        System.out.println("str: "+str);
        System.out.println("a: "+a);
    }
}
