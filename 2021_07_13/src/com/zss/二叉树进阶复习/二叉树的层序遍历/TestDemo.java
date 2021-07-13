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
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.print(cur.val+" ");
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
    }
    public static TreeNode build(){
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');
        TreeNode k = new TreeNode('K');
        TreeNode l = new TreeNode('L');
        TreeNode z = new TreeNode('Z');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = k;
        c.right = l;
        d.left = f;
        d.right = g;
        e.left = h;
        e.right = i;
        k.left = j;
        f.left = z;
        return a;
    }

    public static void main(String[] args) {
        TreeNode root = build();
        levelOrderTree(root);
    }
}
