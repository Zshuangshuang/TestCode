package com.zss.数组中只出现一次的两个数字;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int[] result = new int[2];
        int pos = 0;
        if (array == null){
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