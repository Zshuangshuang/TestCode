package com.zss.算法习题.替换空格;

import java.util.*;


public class Solution {

    public String replaceSpace (String s) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        if (s == null){
            return null;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}