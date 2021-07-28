package com.zss.算法题.字符串的排列;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0){
            return result;
        }
        PermutationHelper(result,0,str.toCharArray());
        Collections.sort(result);
        return result;
    }

    private void PermutationHelper(ArrayList<String> result, int i, char[] chars) {
        if (i == chars.length-1){
            String ret = String.valueOf(chars);
            if (!result.contains(ret)){
                result.add(ret);
            }
        }else {
            for (int j = i; j < chars.length; j++) {
                swap(chars,i,j);
                PermutationHelper(result, i+1, chars);
                //将数组复原，避免对下次递归造成影响
                swap(chars,i,j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}