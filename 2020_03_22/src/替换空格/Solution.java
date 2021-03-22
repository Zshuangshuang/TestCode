package 替换空格;

import java.util.*;


public class Solution {

    public String replaceSpace (String s) {
        if (s == null || s ==""){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
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