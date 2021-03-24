package 调整数组顺序使奇数位于偶数前面;

import java.util.*;

public class Solution {
   
    public int[] reOrderArray (int[] array) {
        Queue<Integer> oldNums = new LinkedList<>();
        Queue<Integer> eveNums = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                oldNums.offer(array[i]);
            }else {
                eveNums.offer(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!oldNums.isEmpty()){
                array[i] = oldNums.poll();
            }else {
                array[i] = eveNums.poll();
            }
        }
        return array;
    }
}