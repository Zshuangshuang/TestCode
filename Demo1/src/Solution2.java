import java.util.*;


public class Solution2 {

    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
        }
        return pRoot;
    }
}