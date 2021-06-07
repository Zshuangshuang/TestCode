
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution1 {

    private boolean isSameTree(TreeNode root1,TreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val){
            result = isSameTree(root1, root2);
        }
        if (!result){
            result = HasSubtree(root1.left,root2);
        }
        if (!result){
            result = HasSubtree(root1.right,root2);
        }
        return result;
    }
}