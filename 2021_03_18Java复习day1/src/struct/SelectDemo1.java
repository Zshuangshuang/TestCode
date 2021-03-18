package struct;

import java.util.Scanner;

public class SelectDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容: ");
        String s = scanner.nextLine();
        //equals用来判断字符串的内容是否相同
        if(s.equals("hello")){
            System.out.println(s);
        }else {
            System.out.println("end");
        }

        scanner.close();
    }
}
