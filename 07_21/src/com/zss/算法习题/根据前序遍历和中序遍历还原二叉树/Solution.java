package com.zss.算法习题.根据前序遍历和中序遍历还原二叉树;

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
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preList = arrayToList(pre);
        List<Integer> inList = arrayToList(in);
        TreeNode root = buildHelper(preList,inList);
        return root;
    }

    private TreeNode buildHelper(List<Integer> preList, List<Integer> inList) {
        if (preList.size() == 0){
            return null;
        }
        int rootVal = preList.get(0);
        TreeNode root = new TreeNode(rootVal);
        if (preList.size() == 1){
            return root;
        }
        int leftPos = inList.indexOf(rootVal);
        List<Integer> preLeft = preList.subList(1,leftPos+1);
        List<Integer> preRight = preList.subList(leftPos+1,preList.size());
        List<Integer> inLeft = inList.subList(0,leftPos);
        List<Integer> inRight = inList.subList(leftPos+1,inList.size());
        root.left = buildHelper(preLeft,inLeft);
        root.right = buildHelper(preRight,inRight);
        return root;
    }

    private List<Integer> arrayToList(int[] pre) {
        List<Integer> result = new ArrayList<>();
        for (int x : pre){
            result.add(x);
        }
        return result;
    }
}