package com.zss.算法题练习.将一棵二叉树变为镜像二叉树;

import java.util.Stack;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
       if (pRoot == null){
           return null;
       }
       Stack<TreeNode> stack = new Stack<>();
       stack.push(pRoot);
       while (!stack.isEmpty()){
           TreeNode node = stack.pop();
           TreeNode tmp = node.left;
           node.left = node.right;
           node.right = tmp;
           if (node.left != null){
               stack.push(node.left);
           }
           if (node.right != null){
               stack.push(node.right);
           }
       }
       return pRoot;
    }
}