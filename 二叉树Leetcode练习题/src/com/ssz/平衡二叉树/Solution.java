package com.ssz.平衡二叉树;

class TreeNode{
    public int val;
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
        //空树返回true
        if (root == null){
            return true;
        }
        //叶子节点返回true
        if (root.left == null && root.right== null){
            return true;
        }
        //求左右子树高度差
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth-rightDepth <-1 || leftDepth-rightDepth > 1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }
}
