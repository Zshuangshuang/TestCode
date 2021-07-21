package com.zss.算法练习day01.二叉树的层序遍历;

import java.util.*;


 class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
 }


public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        if (root == null){
            return result;
        }
        levelOrderHelper(root,0);
        return result;
    }

    private void levelOrderHelper(TreeNode root, int level) {
        if (result.size() == level){
            result.add(new ArrayList<>());
        }
        ArrayList<Integer> list = result.get(level);
        list.add(root.val);
        if (root.left != null){
            levelOrderHelper(root.left,level+1);
        }
        if (root.right != null){
            levelOrderHelper(root.right,level+1);
        }
    }
}