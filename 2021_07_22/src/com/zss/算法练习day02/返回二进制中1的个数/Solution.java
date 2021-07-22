package com.zss.算法练习day02.返回二进制中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}