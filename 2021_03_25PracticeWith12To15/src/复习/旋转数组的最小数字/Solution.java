package 复习.旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0 || array == null){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int middle = left+(right-left)/2;
            if (array[middle] < array[right]){
                right = middle;
            }else if (array[middle] == array[right]){
                right--;
            }else {
                left = middle+1;
            }
        }
        return array[left];
    }
}