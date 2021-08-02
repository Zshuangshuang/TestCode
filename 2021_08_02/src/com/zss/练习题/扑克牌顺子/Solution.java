package com.zss.练习题.扑克牌顺子;


import java.util.TreeSet;

public class Solution {
    public boolean IsContinuous(int [] numbers) {
        if (numbers == null || numbers.length != 5){
            return false;
        }
        int count = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                count++;
            }else {
                set.add(numbers[i]);
            }
        }
        if (count + set.size() != 5){
            return false;
        }
        if (set.last() - set.first() < 5){
            return true;
        }
        return false;
    }

}