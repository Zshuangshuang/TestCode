package com.zss.左旋转字符数组;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if ("".equals(str) || n > str.length() || str == null){
            return str;
        }
        n = n%str.length();
        return str.substring(n)+str.substring(0,n);
    }

}