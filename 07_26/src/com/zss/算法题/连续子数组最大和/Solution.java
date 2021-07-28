package com.zss.算法题.连续子数组最大和;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0 || array == null){
            return 0;
        }
        int maxSum = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > maxSum){
                maxSum = sum;
            }
            if (sum < array[0]){
                sum = 0;
            }
        }
        return maxSum;
    }
}