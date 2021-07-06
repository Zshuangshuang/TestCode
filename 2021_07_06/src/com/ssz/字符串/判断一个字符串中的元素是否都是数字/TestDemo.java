package com.ssz.字符串.判断一个字符串中的元素是否都是数字;


public class TestDemo {
    public static boolean isAllNum(String str){
        if (str == null){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch >'9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAllNum("hello"));
        System.out.println(isAllNum("12Abc"));
        System.out.println(isAllNum("1234567"));
    }
}
