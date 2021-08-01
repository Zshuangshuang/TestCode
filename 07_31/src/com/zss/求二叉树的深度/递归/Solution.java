package com.zss.求二叉树的深度.递归;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}