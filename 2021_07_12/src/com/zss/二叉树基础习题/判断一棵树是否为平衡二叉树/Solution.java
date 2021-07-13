package com.zss.二叉树基础习题.判断一棵树是否为平衡二叉树;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    private int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int depth = leftDepth-rightDepth;
        if (Math.abs(depth) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}