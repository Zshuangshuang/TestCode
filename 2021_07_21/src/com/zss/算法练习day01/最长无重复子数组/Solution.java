package com.zss.算法练习day01.最长无重复子数组;

import java.util.*;


public class Solution {
    /**
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        if (arr == null || arr.length == 0){
            return 0;
        }
        if (arr.length == 1){
            return 1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int left = 0,right = 0; left < arr.length; left++) {
            if (map.containsKey(arr[left])){
                right = Math.max(map.get(arr[left])+1,right);
            }
            map.put(arr[left],left);
            max = Math.max(max,left-right+1);
        }
        return max;
    }
}