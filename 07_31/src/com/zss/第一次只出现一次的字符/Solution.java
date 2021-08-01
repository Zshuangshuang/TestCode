package com.zss.第一次只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
       if (str == null || "".equals(str)){
           return -1;
       }
       char[] ch = str.toCharArray();
       Map<Character,Integer> map = new HashMap<>();
       for (char c : ch){
           if (map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else {
               map.put(c,1);
           }
       }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}