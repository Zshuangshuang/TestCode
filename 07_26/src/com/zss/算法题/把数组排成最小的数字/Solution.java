package com.zss.算法题.把数组排成最小的数字;

import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        //判断参数的额合法性
        if (numbers == null || numbers.length == 0){
            return "";
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum1 = Integer.valueOf(numbers[i]+""+numbers[j]);
                int sum2 = Integer.valueOf(numbers[j]+""+numbers[i]);
                if (sum1 > sum2){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            ret.append(numbers[i]);
        }
        return ret.toString();
    }
}