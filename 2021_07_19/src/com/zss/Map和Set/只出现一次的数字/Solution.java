package com.zss.Map和Set.只出现一次的数字;

import java.util.HashMap;
import java.util.Map;


class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ;i++) {
            if (map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
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