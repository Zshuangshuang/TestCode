package com.zss.算法习题.二叉树中和为某一值的路径;

import java.util.ArrayList;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || root.val > target){
            return result;
        }
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0){
            result.add(new ArrayList<>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        path.remove(path.size()-1);
        return result;
    }
}