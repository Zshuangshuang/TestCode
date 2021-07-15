package com.zss.二叉树进阶复习.二叉搜索树与双向链表;

class  TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode leftTail = left;
        while (leftTail != null && leftTail.right != null){
            leftTail = leftTail.right;
        }
        if (left != null){
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null){
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return (left == null)?pRootOfTree:left;
    }
}