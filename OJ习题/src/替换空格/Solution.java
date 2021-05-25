package 替换空格;

import java.util.*;


public class Solution {
 
    public String replaceSpace (String s) {
        // write code here
        if (s == null){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
}