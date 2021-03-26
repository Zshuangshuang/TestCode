package 复习.调整奇数使奇数位于偶数之前;

import java.util.*;


public class Solution {

    public int[] reOrderArray (int[] array) {
        Queue<Integer> oddNums = new LinkedList<>();
        Queue<Integer> eveNums = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                oddNums.offer(array[i]);
            }else {
                eveNums.offer(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
           if (!oddNums.isEmpty()){
                array[i] = oddNums.poll();
            }
            else {
                array[i] = eveNums.poll();
            }
        }
        return array;
    }
}