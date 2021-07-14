package com.zss.二叉树进阶复习.判定一棵树是否为完全二叉树;

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
    public static boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return true;
        }
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (!flag){
                if (cur.left != null && cur.right != null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if (cur.left == null && cur.right != null){
                    return false;
                }else if (cur.left != null && cur.right == null){
                    flag = true;
                    queue.offer(cur.left);
                }else {
                    flag = true;
                }
            }else {
                if (cur.left != null || cur.right != null){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
