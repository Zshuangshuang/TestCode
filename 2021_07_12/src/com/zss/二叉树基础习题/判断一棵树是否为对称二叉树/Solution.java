package com.zss.二叉树基础习题.判断一棵树是否为对称二叉树;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isMiroor(root.left,root.right);
    }

    private boolean isMiroor(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return isMiroor(t1.left,t2.right) && isMiroor(t1.right,t2.left);
    }
}