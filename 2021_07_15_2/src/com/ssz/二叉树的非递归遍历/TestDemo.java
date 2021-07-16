package com.ssz.二叉树的非递归遍历;

import java.util.List;
import java.util.Stack;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TestDemo {
    public static TreeNode buildTree(){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }
    public static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val+" ");
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true){
            //1.循环找到二叉树的最左侧元素
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            //2.如果栈为null，则遍历结束
            if (stack.isEmpty()){
                break;
            }
            //3.取出栈顶元素并访问
            TreeNode top = stack.pop();
            System.out.print(top.val+" ");
            //4.继续遍历当前节点的右子树
            cur = top.right;
        }
    }
    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        TreeNode cur = root;
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        while (true){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode top = stack.peek();
            if (top.right == null || prev == top.right){
                System.out.print(top.val+" ");
                stack.pop();
                prev = top;
            }else {
                cur = top.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
    }
}
