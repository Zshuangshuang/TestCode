package com.ssz.判断两棵树是否相同;

class TreeNode{
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //如果p,q均为null,直接返回true
        if (p == null && q == null){
            return true;
        }
        //如果p,q其中有一棵树为Null,直接返回false
        if (p == null || q == null){
            return false;
        }
        //p,q根节点值不相同则返回false
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
