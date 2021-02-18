package com.zss.旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    public Integer minNumberInRotateArray(int [] array) {
        if (array.length == 0 || array == null){
            return null;
        }
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum){
                minNum = array[i];
            }
        }
        return minNum;
    }
}