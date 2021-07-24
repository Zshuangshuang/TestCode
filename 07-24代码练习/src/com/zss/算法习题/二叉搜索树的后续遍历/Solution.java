package com.zss.算法习题.二叉搜索树的后续遍历;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0){
            return false;
        }
        int left = 0;
        int right = sequence.length-1;
        while (right > 0){
            //找到根节点
            while (sequence[left] < sequence[right]){
                left++;
            }
            //找到右子树的最大值
            while (sequence[left] > sequence[right]){
                left++;
            }
            if (left < right){
                return false;
            }
            right --;
            left = 0;
        }
        return true;
    }
}