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
        boolean flg = false;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (!flg){
                if (tmp.left != null && tmp.right != null){
                    queue.offer(tmp.left);
                    queue.offer(tmp.right);
                }else if (tmp.left == null && tmp.right != null){
                    return false;
                }else if (tmp.left != null && tmp.right == null){
                    flg = true;
                    queue.offer(tmp.left);
                }else {
                    flg = true;
                }
            }else {
                if (tmp.left != null || tmp.right != null){
                    return false;
                }
            }
        }
        return true;
    }
}
