package com.zss.树的基本遍历方式;

class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }

}
public class TestDemo {
    public static TreeNode build(){
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        a.left = b;
        b.left = d;
        b.right = e;
        e.left = g;
        g.right = h;
        a.right = c;
        c.right = f;
        return a;
    }
    public static void prevOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        prevOrder(root.left);
        prevOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        TreeNode root = build();
        prevOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
