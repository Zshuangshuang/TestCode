package com.zss.二叉树进阶复习.从中序遍历和后续遍历创建二叉树;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inOrderList = arrayToList(inorder);
        List<Integer> postOrderList = arrayToList(postorder);
        TreeNode root = buildHelper(inOrderList,postOrderList);
        return root;
    }

    private TreeNode buildHelper(List<Integer> inOrderList, List<Integer> postOrderList) {
        if (inOrderList.size() == 0){
            return null;
        }
        if (inOrderList.size() == 1){
            return new TreeNode(inOrderList.get(0));
        }
        int rootVal = postOrderList.get(postOrderList.size()-1);
        TreeNode root = new TreeNode(rootVal);
        int leftSize = inOrderList.indexOf(rootVal);
        List<Integer> leftIn = inOrderList.subList(0,leftSize);
        List<Integer> rightIn = inOrderList.subList(leftSize+1,inOrderList.size());
        List<Integer> leftPost = postOrderList.subList(0,leftSize);
        List<Integer> rightPost = postOrderList.subList(leftSize,postOrderList.size()-1);
        root.left = buildHelper(leftIn,leftPost);
        root.right = buildHelper(rightIn,rightPost);
        return root;
    }

    private List<Integer> arrayToList(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int x : arr){
            result.add(x);
        }
        return result;
    }
}