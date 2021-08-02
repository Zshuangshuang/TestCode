package com.zss.练习题.和为s的两个数字;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array == null || array.length == 0){
            return arrayList;
        }
        int left = 0;
        int right = array.length-1;
        while (left < right){
            if (array[left] + array[right] == sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                break;
            }else if (array[left] + array[right] < sum){
                left++;
            }else {
                right--;
            }
        }
        return arrayList;
    }
}