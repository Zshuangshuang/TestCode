package com.zss.算法习题.调整使得奇数位于偶数之前;

public class Solution {

    public int[] reOrderArray (int[] array) {
        // write code here
        if (array.length == 0 || array == null) {
            return array;
        }
        int tmp = 0;
        int oddPos = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            if (array[i] %2 == 0){
                continue;
            }else {
                int evePos = i;
                while (evePos > oddPos){
                    array[evePos] = array[evePos-1];
                    evePos--;
                }
                array[oddPos] = tmp;
                oddPos++;
            }
        }
        return array;
    }
}