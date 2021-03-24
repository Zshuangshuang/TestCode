package 旋转数组最小的数字;

import java.util.*;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
      //判断参数的合法性
        if (array.length == 0 || array == null){
            return 0;
        }
        //左右指针法定位元素
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int mid = left+(right-left)/2;
            if (array[mid] < array[right]){
                right = mid;
            }else if (array[mid] == array[right]){
                right--;
            }else {
                left = mid+1;
            }
        }
        return array[right];
    }
}