package com.zss.平衡二叉树;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (left-right <-1 || left-right > 1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}