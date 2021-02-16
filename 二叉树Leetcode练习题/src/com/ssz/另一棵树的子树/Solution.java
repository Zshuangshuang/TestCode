package com.ssz.另一棵树的子树;

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
    private boolean isSameTree(TreeNode s, TreeNode t){
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        if (s.val != t.val){
            return false;
        }
        return isSameTree(s.left,t.left)&&isSameTree(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //若s,t均为null,返回true
        if (s == null && t == null){
            return true;
        }
        //若s,t仅有一个为null,返回false
        if (s == null || t == null){
            return false;
        }
        //判断s,t是否为相同的树
        boolean ret = false;
        if (s.val == t.val){
            ret = isSameTree(s,t);
        }
        return ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
}
