package com.zss.二叉树进阶复习.二叉树遍历;

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
        return createPreTree(line);
    }

    private static TreeNode createPreTree(String line) {
        char ch = line.charAt(index);
        if (ch == '#'){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = createPreTree(line);
        root.right = createPreTree(line);
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        TreeNode root = build(line);
        inorder(root);
        System.out.println();
    }

}
