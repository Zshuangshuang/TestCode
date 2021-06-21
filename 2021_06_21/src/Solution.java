import java.util.ArrayList;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        //判断参数的合法性
        if (root == null || root.val > target){
            return result;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            result.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        path.remove(path.size()-1);
        return result;
    }
    public static TreeNode buildTree(){
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(12);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        return a;
    }
    public static void main(String[] args) {
        TreeNode root = buildTree();
        ArrayList<ArrayList<Integer>> path = FindPath(root,22);
        System.out.println(path);
    }
}