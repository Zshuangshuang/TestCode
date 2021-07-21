package com.zss.算法练习day01.没有重复项数字的排列;

import java.util.*;

public class Solution {
   static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
       if (num == null || num.length < 1){
           return result;
       }
       Arrays.sort(num);
       ArrayList<Integer> list = new ArrayList<>();
       permuteHelper(list,num);
       return result;
    }

    private static void permuteHelper(ArrayList<Integer> list, int[] num) {
        if (list.size() == num.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (!list.contains(num[i])){
                list.add(num[i]);
                permuteHelper(list,num);
                list.remove(list.size()-1);
            }
        }
    }


}