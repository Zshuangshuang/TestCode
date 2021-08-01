package com.zss.和为s的两个数字;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
       ArrayList<Integer> result = new ArrayList<>();
       if (array == null || array.length == 0){
           return result;
       }
       int leftIndex = 0;
       int rightIndex = array.length-1;
       while (leftIndex < rightIndex){
           if (array[leftIndex] + array[rightIndex] == sum){
               result.add(array[leftIndex]);
               result.add(array[rightIndex]);
               break;
           }else if (array[leftIndex] + array[rightIndex] < sum){
               leftIndex++;
           }else {
               rightIndex--;
           }
       }
       return result;
    }
}