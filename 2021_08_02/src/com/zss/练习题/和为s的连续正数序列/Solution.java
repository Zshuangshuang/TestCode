package com.zss.练习题.和为s的连续正数序列;



import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
      if (sum <= 0){
          return result;
      }
        for (int i = 1; i < sum; i++) {
            int ret = 0;
            int pos = i;
            while (ret < sum){
                ret += pos;
                pos++;
            }
            if (ret == sum){
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int j = i; j < pos; j++) {
                    arrayList.add(j);
                }
                result.add(arrayList);
            }
        }
        return result;
    }
}