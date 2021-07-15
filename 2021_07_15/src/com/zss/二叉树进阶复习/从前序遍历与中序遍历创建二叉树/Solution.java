package com.zss.二叉树进阶复习.从前序遍历与中序遍历创建二叉树;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preOrderList = arrayToList(preorder);
        List<Integer> inOrderList = arrayToList(inorder);
        TreeNode root = buildHelper(preOrderList,inOrderList);
        return root;
    }

    private TreeNode buildHelper(List<Integer> preOrderList, List<Integer> inOrderList) {
        if (preOrderList.size() == 0){
            return null;
        }
        int rootVal = preOrderList.get(0);
        TreeNode root = new TreeNode(rootVal);
        if (preOrderList.size() == 1){
            return root;
        }
        int leftSize = inOrderList.indexOf(rootVal);
        List<Integer> leftPre = preOrderList.subList(1,leftSize+1);
        List<Integer> rightPre = preOrderList.subList(leftSize+1,preOrderList.size());
        List<Integer> leftIn = inOrderList.subList(0,leftSize);
        List<Integer> rightIn = inOrderList.subList(leftSize+1,inOrderList.size());
        root.left = buildHelper(leftPre,leftIn);
        root.right = buildHelper(rightPre,rightIn);
        return root;
    }

    private List<Integer> arrayToList(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int x : arr){
            result.add(x);
        }
        return result;
    }
}