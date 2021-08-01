package com.zss.数字在升序数组中出现的次数;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       if (array == null || array.length == 0){
           return 0;
       }
       int start = -1;
       int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                start = i;
                break;
            }
        }
        if (start < 0){
            return 0;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] != k){
                break;
            }
            count++;
        }
        return count;
    }
}