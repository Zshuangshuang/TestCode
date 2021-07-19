package com.zss.Map和Set.宝石与石头;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()){
            set.add(ch);
        }
        int ret = 0;
        for (char ch : stones.toCharArray()){
            if (set.contains(ch)){
                ret++;
            }
        }
        return ret;
    }
}