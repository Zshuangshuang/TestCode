package com.zss.算法题.数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        for (int x : array){
            if (map.get(x) > (array.length/2)){
                return x;
            }
        }
        return 0;
    }
}