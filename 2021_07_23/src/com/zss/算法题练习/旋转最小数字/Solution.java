package com.zss.算法题练习.旋转最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
       if (array.length == 0 || array == null){
           return 0;
       }
       int left = 0;
       int right = array.length-1;
       while (left <= right){
           int mid = left+(right-left)/2;
           if (array[mid] < array[right]){
               right = mid;
           }else if (array[mid] == array[right]) {
               right--;
           }else {
               left = mid+1;
           }
       }
       return array[left];
    }
}