package 练习.镜像二叉树;

import java.util.TreeSet;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null){
            return null;
        }
        TreeNode tmp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = tmp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}