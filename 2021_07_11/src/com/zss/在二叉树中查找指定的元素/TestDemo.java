package com.zss.在二叉树中查找指定的元素;

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
    public static TreeNode find(TreeNode root,char toFind){
        if (root == null){
            return null;
        }
        if (root.val == toFind){
            return root;
        }
        TreeNode ret = find(root.left,toFind);
        if (ret != null){
            return ret;
        }
        return find(root.right,toFind);
    }
    public static void main(String[] args) {

    }
}
