package com.zss.算法题.二叉树的后续遍历序列;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0 || sequence == null){
            return false;
        }
        int left = 0;
        int right = sequence.length-1;
        while (right != 0){
            while (sequence[left] < sequence[right]){
                left++;
            }
            while (sequence[left] > sequence[right]){
                left++;
            }
            if (left < right){
                return false;
            }
            right--;
            left = 0;
        }
        return true;
    }
}