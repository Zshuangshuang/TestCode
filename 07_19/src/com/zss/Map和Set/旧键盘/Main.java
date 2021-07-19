package com.zss.Map和Set.旧键盘;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //1.循环读取预期结果和实际结果
           String expected = scanner.next();
           String actual = scanner.next();
           //2.将预期结果和实际结果转为大写字母
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            //3.将实际结果放入set
            Set<Character> actualSet = new HashSet<>();
            for (char ch : actual.toCharArray()){
                actualSet.add(ch);
            }
            //4.将预期结果里面没有的字符打印
            Set<Character> brokenSet = new HashSet<>();
            for (char ch : expected.toCharArray()){
                if (actualSet.contains(ch)){
                    continue;
                }
                if (brokenSet.contains(ch)){
                    continue;
                }
                System.out.print(ch);
                brokenSet.add(ch);
            }
        }
    }
}
