package com.zss.二叉树进阶复习.判断一棵树是否为完全二叉树;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TestDemo {
    public boolean isCompleteTree(TreeNode root){
        if (root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flg = false;
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (!flg){
                if (cur.left != null && cur.right != null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if (cur.left == null && cur.right != null){
                    return false;
                }else if (cur.left != null && cur.right == null){
                    flg = true;
                    queue.offer(cur.left);
                }else {
                    flg = true;
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
