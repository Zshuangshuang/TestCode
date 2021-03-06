package 重建二叉树;

import org.omg.CORBA.INTERNAL;

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
        //首先将数组转化为List,便于操作
        List<Integer> preList = arrayToList(pre);
        List<Integer> inList = arrayToList(in);
        TreeNode root = helper(preList,inList);
        return root;
    }

    private TreeNode helper(List<Integer> preList, List<Integer> inList) {
        //判断参数的合法性
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
        List<Integer> inLeft = inList.subList(0,leftPos+1);
        List<Integer> inRight = inList.subList(leftPos+1,inList.size());
        root.left = helper(preLeft,inLeft);
        root.right = helper(preRight,inRight);
        return root;
    }

    private List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int x : array){
            list.add(x);
        }
        return list;
    }
}