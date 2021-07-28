package com.zss.算法题.整数中出现1的次数;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
       int count = 0;
       StringBuilder ret = new StringBuilder("");
        for (int i = 1; i <= n; i++) {
            ret.append(i);
        }
        for (int i = 0; i < ret.length(); i++) {
            if (ret.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}