package com.zss.丑数;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0){
            return 0;
        }
        if (index < 7){
            return index;
        }
        int[] result = new int[index];
        result[0] = 1;
        int pos_2 = 0;
        int pos_3 = 0;
        int pos_5 = 0;
        for (int i = 1; i < index; i++) {
            result[i] = Math.min(Math.min(result[pos_2]*2,result[pos_3]*3),result[pos_5]*5);
            if (result[i] == result[pos_2]*2){
                pos_2++;
            }
            if (result[i] == result[pos_3]*3){
                pos_3++;
            }
            if (result[i] == result[pos_5]*5){
                pos_5++;
            }
        }
        return result[index-1];
    }
}