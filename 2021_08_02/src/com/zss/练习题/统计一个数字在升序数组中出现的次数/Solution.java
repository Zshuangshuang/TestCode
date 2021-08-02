package com.zss.练习题.统计一个数字在升序数组中出现的次数;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       if (array == null || array.length == 0 ){
           return 0;
       }
       int count = 0;
       int j = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                j = i;
                break;
            }
        }
        if (j < 0){
            return 0;
        }
        for (int i = j; i < array.length; i++) {
            if (array[i] == k){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}