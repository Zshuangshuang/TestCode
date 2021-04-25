package 数字在升序数组中出现的次数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
      //判断参数的合法性
        if (array.length == 0 || array == null){
            return 0;
        }
        int count = 0;
        int start = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                start = i;
                break;
            }
        }
        if (start < 0){
            return  0;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] != k){
                break;
            }
            count++;
        }
        return count;
    }
}