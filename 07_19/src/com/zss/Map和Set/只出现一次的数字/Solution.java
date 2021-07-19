package com.zss.Map和Set.只出现一次的数字;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public Integer singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : nums){
            if (map.get(x) == null){
                map.put(x,1);
            }else {
                map.put(x,map.get(x)+1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                result = entry.getKey();
            }
        }
        return result;
    }
}