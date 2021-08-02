package com.zss.练习题.左旋转字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
       if (str == null || "".equals(str) || n <= 0){
           return str;
       }
       n = n%str.length();
       return str.substring(n)+str.substring(0,n);
    }
}