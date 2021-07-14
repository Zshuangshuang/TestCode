package com.zss.二叉树进阶复习.二叉树的层序遍历;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class TestDemo {
    public static void levelOrderTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            System.out.print(tmp.val+" ");
            if (tmp.left != null){
                queue.offer(tmp.left);
            }
            if (tmp.right != null){
                queue.offer(tmp.right);
            }
        }
    }
    public static void main(String[] args) {

    }
}
