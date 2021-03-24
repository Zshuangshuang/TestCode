package 重建二叉树;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preList = arrayToList(pre);
        List<Integer> inList = arrayToList(in);
        TreeNode root = helper(preList,inList);
        return root;
    }

    private TreeNode helper(List<Integer> preList, List<Integer> inList) {
        if (preList.size() == 0){
            return null;
        }
        int rootVal = preList.get(0);
        TreeNode root = new TreeNode(rootVal);
        if (preList.size() == 1){
            return root;
        }
        int leftSize = inList.indexOf(rootVal);
        List<Integer> preLeft = preList.subList(1,leftSize+1);
        List<Integer> preRight = preList.subList(leftSize+1,preList.size());
        List<Integer> inLeft = inList.subList(0,leftSize+1);
        List<Integer> inRight = inList.subList(leftSize+1,inList.size());
        root.left = helper(preLeft,inLeft);
        root.right = helper(preRight,inRight);
        return root;
    }

    private List<Integer> arrayToList(int[] pre) {
        if (pre == null){
            return null;
        }
        List<Integer> result = new ArrayList<>();
        for (int x : pre){
            result.add(x);
        }
        return result;
    }
}