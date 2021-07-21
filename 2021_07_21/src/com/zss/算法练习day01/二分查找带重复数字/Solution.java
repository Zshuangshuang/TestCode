package com.zss.算法练习day01.二分查找带重复数字;

import java.util.*;


public class Solution {

    public int search (int[] nums, int target) {
        // write code here
        //判断参数的合法性
       if (nums == null || nums.length == 0){
           return -1;
       }
       int left = 0;
       int right = nums.length-1;
       int mid = 0;
       while (left <= right){
           mid = left+(right-left)/2;
           if (nums[mid] == target){
               while (mid > 0 && nums[mid] == nums[mid-1]){
                   mid--;
               }
               return mid;
           }else if (nums[mid] > target){
               right = mid-1;
           }else {
               left = mid+1;
           }
       }
       return -1;
    }
}