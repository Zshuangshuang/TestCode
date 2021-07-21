package com.zss.算法习题.旋转数组的最小数字;



public class Solution {
    public int minNumberInRotateArray(int [] array) {
      if (array == null || array.length == 0){
          return 0;
      }
      int left = 0;
      int right = array.length-1;
      while (left < right){
          int mid = left+(right - left)/2;
          if (array[mid] < array[right]){
              right = mid;
          }else if (array[mid] == array[right]){
              right--;
          }else {
              left = mid+1;
          }
      }
      return array[left];
    }
}