package com.zss.判断一棵树是不是完全二叉树;

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
public class TestTree {
    public static TreeNode buildTree(){
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        a.left = b;
        a.right = c;
        c.right = f;
        b.left = d;
        b.right = e;
        e.left = g;
        return a;
    }
    public static boolean isCompleteTree(TreeNode root){
        //如果是空树,直接返回true
        if (root == null){
            return true;
        }
        //判断是第一阶段还是第二阶段
        boolean isSecondStage = false;
        //将根节点入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode ret = queue.poll();
            //进入第一阶段
            if (!isSecondStage){
                if (ret.left != null && ret.right != null){
                    queue.offer(ret.left);
                    queue.offer(ret.right);
                }else if (ret.left == null && ret.right != null){
                    return false;
                }else if (ret.left != null && ret.right == null){
                    queue.offer(ret.left);
                    isSecondStage = true;
                }else {
                    isSecondStage = true;
                }
            }else {
                //进入第二阶段,要满足二叉树的左右子树都没有子树
                if (ret.left != null || ret.right != null){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println(isCompleteTree(root));
    }
}
