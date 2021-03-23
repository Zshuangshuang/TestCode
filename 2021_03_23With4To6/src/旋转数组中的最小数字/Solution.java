package 旋转数组中的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
       //根据题意，数组为空或者数组中没有元素，返回0
        if(array.length == 0 || array == null){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int middle = left+(right-left)/2;
            //当array[middle]<array[right]的时候，证明array[middle~right]是一个递增数组
            // 最小值有可能是middle下标对应的数字
            if (array[middle] < array[right]){
                right = middle;
            }else if (array[middle] > array[right]){
                //最小值一定在[middle+1,right]中
                left = middle+1;
            }else {
                right--;
            }
        }
        return array[left];
    }
}