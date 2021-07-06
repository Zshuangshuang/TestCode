package com.ssz.字符串.字符串的比较;

public class TestDemo {
    public static void main(String[] args) {
       //String str1 = "houhou";
        //String str2 = "heihei";
        //按照字典序比较字符串的大小，用CompareTo()
        //若CompareTo()返回值大于0，则认为str1>str2
        //若CompareTo()返回值小于0，则认为str1<str2;
        //若返回值CompareTo()返回值等于0，则认为str1和str2的内容相同
        //System.out.println(str1.compareTo(str2));
        String str1 = "haha";
        String str2 = "HaHa";
        //比较str1与str2的内容时忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
