package com.ssz.二叉树的前序遍历;


import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        //访问根节点
        result.add(root.val);
        //递归访问左子树
        result.addAll(preorderTraversal(root.left));
        //递归访问右子树
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
