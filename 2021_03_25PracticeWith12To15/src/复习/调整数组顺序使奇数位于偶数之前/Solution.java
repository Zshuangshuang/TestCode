package 复习.调整数组顺序使奇数位于偶数之前;

import java.util.*;


public class Solution {
   
    public int[] reOrderArray (int[] array) {
        Queue<Integer> odd = new LinkedList<>();
        Queue<Integer> eve = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                odd.offer(array[i]);
            }else {
                eve.offer(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!odd.isEmpty()){
                array[i] = odd.poll();
            }else {
                array[i] = eve.poll();
            }
        }
        return array;
    }
}