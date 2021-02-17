package com.zss.二叉树的层序遍历;

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
    public static void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode ret = queue.poll();
            System.out.print(ret.val+" ");
            if (ret.left != null){
                queue.offer(ret.left);
            }
            if (ret.right != null){
                queue.offer(ret.right);
            }
        }
        /*//使用队列,将根节点入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //循环取出队列的队首元素
        while(!queue.isEmpty()){
           TreeNode ret = queue.poll();
           //访问根节点
            System.out.print(ret.val+" ");
            //若左子树不为空,将左子树入队列
            if (ret.left != null){
                queue.offer(ret.left);
            }
            //若右子树不为空,将右子树入队列
            if (ret.right != null){
                queue.offer(ret.right);
            }

        }*/
    }
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

    public static void main(String[] args) {
        TreeNode root = buildTree();
        levelOrder(root);

    }
}
