package com.zss.集合.括号匹配;

import java.util.HashMap;

import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
       if (s == null){
           return false;
       }
       Map<Character,Character> map = new HashMap<>();
       map.put('(',')');
       map.put('{','}');
       map.put('[',']');
       Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char top = stack.pop();
            if (map.get(top) == ch){
                continue;
            }else {
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}