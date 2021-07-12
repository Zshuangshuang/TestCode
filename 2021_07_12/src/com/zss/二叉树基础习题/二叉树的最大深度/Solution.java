package com.zss.二叉树基础习题.二叉树的最大深度;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}