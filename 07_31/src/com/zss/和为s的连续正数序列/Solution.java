package com.zss.和为s的连续正数序列;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 1; i < sum; i++) {
            int sm = 0;
            int j = i;
            while (sm < sum){
                sm += j;
                j++;
            }
            if (sm == sum){
                ArrayList<Integer> re = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    re.add(k);
                }
                result.add(re);
            }
        }
        return result;
    }
}