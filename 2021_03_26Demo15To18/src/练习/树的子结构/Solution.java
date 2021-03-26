package 练习.树的子结构;



class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }
        boolean ret = false;
        if (root1.val == root2.val){
            ret = doesTree1HasTree2(root1, root2);
        }
        if (!ret){
            ret = HasSubtree(root1.left,root2);
        }
        if (!ret){
            ret = HasSubtree(root1.right,root2);
        }
        return ret;

    }
    private boolean doesTree1HasTree2(TreeNode root1,TreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }
        return doesTree1HasTree2(root1.left,root2.left)&&doesTree1HasTree2(root1.right,root2.right);
    }
}