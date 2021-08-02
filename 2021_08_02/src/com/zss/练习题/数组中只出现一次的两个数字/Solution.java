package com.zss.练习题.数组中只出现一次的两个数字;

import java.util.*;


public class Solution {

    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int[] result = new int[2];
        int pos = 0;
        if (array.length == 0 || array == null){
            return result;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : array){
            if (map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else {
                map.put(x,1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1){
                result[pos] = array[i];
                pos++;
            }
        }
        Arrays.sort(result);
        return result;
    }
}