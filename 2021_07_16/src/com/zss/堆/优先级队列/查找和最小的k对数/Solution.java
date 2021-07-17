package com.zss.堆.优先级队列.查找和最小的k对数;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


class Pair implements Comparable<Pair>{
    public int n1;
    public int n2;
    public int sum;

    public Pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.sum = n1+n2;
    }

    @Override
    public int compareTo(Pair o) {
        return this.sum-o.sum;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        //1.判断参数的合法性
        if (nums1.length == 0 || nums2.length == 0 || k <= 0){
            return result;
        }
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                priorityQueue.offer(new Pair(nums1[i],nums2[j]));
            }
        }
        for (int i = 0; i < k && !priorityQueue.isEmpty(); i++) {
            Pair cur = priorityQueue.poll();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(cur.n1);
            tmp.add(cur.n2);
            result.add(tmp);
        }
        return result;
    }
}