package com.zss.二叉树进阶复习.根据二叉树创建字符串;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    private StringBuilder stringBuilder = new StringBuilder();
    public String tree2str(TreeNode root) {
        if (root == null){
            return "";
        }
        help(root);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    private void help(TreeNode root) {
        if (root == null){
            return;
        }
        stringBuilder.append("(");
        stringBuilder.append(root.val);
        if (root.left == null && root.right != null){
            stringBuilder.append("()");
        }
        help(root.left);
        help(root.right);
        stringBuilder.append(")");
    }
}