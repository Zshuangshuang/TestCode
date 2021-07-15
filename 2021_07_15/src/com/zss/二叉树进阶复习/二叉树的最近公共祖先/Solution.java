package com.zss.二叉树进阶复习.二叉树的最近公共祖先;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        findLca(root,p,q);
        return lca;
    }

    private boolean findLca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        int left = findLca(root.left,p,q)?1:0;
        int right = findLca(root.right,p,q)?1:0;
        int mid = (root == p) || (root == q)?1:0;
        if (left+right+mid == 2){
            lca = root;
        }
        return left+right+mid>0;
    }
}