package com.zss.求二叉树的深度.非递归;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        int high = 0;
        queue.offer(root);
        while (queue.size() != 0){
            res = queue.size();
            while (res != 0){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                res--;
            }
            high++;
        }
        return high;
    }
}