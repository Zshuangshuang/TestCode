package com.zss.替换空格;


public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str == null){
            return null;
        }
        //stringBuffer线程安全
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
}
