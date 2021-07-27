package com.zss.算法题.字符串的排列;

import java.util.ArrayList;

import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        //如果当前给定字符串为null
        if(str == null || str.length() == 0){
            return res;
        }
        //将结果集作为参数
        helper(res,0,str.toCharArray());
        //符合字典序输出
        Collections.sort(res);
        return res;
    }

    public void helper(ArrayList<String> res,int index,char[] s){
        if(index == s.length - 1){
            res.add(String.valueOf(s));
            return;
        }

        for(int i = index;i < s.length;i++){
            if(i == index || s[index] != s[i]){
                swap(s,index,i);
                helper(res,index + 1,s);
                swap(s,index,i);
            }
        }


    }

    public void swap(char[] c,int a,int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }

}