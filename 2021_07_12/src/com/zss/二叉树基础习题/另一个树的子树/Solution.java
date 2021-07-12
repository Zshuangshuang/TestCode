package com.zss.二叉树基础习题.另一个树的子树;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    private boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }
        boolean ret = false;
        if (root.val == subRoot.val){
            ret = isSameTree(root,subRoot);
        }
      return ret || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}