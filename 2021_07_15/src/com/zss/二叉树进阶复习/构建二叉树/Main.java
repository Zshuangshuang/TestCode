package com.zss.二叉树进阶复习.构建二叉树;

import java.util.Scanner;

class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class Main {
    private static int index = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            TreeNode root = build(line);
            inorder(root);
            System.out.println();
        }
    }

    private static void inorder(TreeNode root) {
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    private static TreeNode build(String line) {
        index = 0;
        return buildHelper(line);
    }

    private static TreeNode buildHelper(String line) {
        char ch = line.charAt(index);
        if (index == '#'){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = build(line);
        root.right = build(line);
        return root;
    }
}
