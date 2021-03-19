package 重建二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据先序遍历和中序遍历还原二叉树
 * 思路:①首先将数组转为list
 *
 * */
class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    private List<Integer> arrayToList(int[] array){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preList = arrayToList(pre);
        List<Integer> inList = arrayToList(in);
        TreeNode node = helper(preList,inList);
        return node;
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
        List<Integer> preLeft = preList.subList(1,leftSize);
        List<Integer> preRight = preList.subList(leftSize+1,preList.size());
        List<Integer> inLeft = inList.subList(0,leftSize);
        List<Integer> inRight = inList.subList(leftSize+1,inList.size());
        root.left = helper(preLeft,inLeft);
        root.right = helper(preRight,inRight);
        return root;
    }
}