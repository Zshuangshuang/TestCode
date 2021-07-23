package com.zss.算法题练习.树的子结构;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val){
            result = isSameTree(root1,root2);
        }
        if (!result){
            result = HasSubtree(root1.left,root2);
        }
        return result || HasSubtree(root1.right,root2);
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if ( root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
}