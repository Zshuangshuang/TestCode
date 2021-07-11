package com.zss.求二叉树叶子节点的个数;



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
    public static int leafSize(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return leafSize(root.left)+leafSize(root.right);
    }
    public static void main(String[] args) {
        TreeNode root  = build();
        int ret = leafSize(root);
        System.out.println(ret);
    }
}
