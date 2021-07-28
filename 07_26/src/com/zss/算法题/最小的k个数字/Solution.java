package com.zss.算法题.最小的k个数字;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
         if (input == null || input.length == 0 || k > input.length || k <= 0){
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < input.length; i++) {
            queue.offer(input[i]);
        }
        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
}