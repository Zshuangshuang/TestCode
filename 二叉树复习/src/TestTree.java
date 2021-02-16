class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class TestTree {
    public static void prevOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        prevOrder(root.left);
        prevOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    //求二叉树节点的个数
    public static int size(TreeNode root){
        if (root == null){
            return 0;
        }
        //二叉树节点个数=左子树节点个数+右子树节点个数
        return 1+size(root.left)+size(root.right);
    }
    //求二叉树叶子节点的个数
    //叶子节点个数=左子树叶子节点个数+右子树叶子节点个数
    public static int leafSize(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.left == null){
            return 1;
        }
        return leafSize(root.left)+leafSize(root.right);
    }
    //求第k层节点个数
    //第k层节点个数=k-1层左子树节点的个数+k-1层右子树的节点个数
    public static int kLevelSize(TreeNode root,int k){
        if (root == null || k < 1){
            return 0;
        }
        if (k == 1){
            return 1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
    }
    //在二叉树中查找某个元素
    public static TreeNode find(TreeNode root,char val){
        if (root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        TreeNode result = find(root.left,val);
        if (result != null){
            return result;
        }
        return find(root.right,val);
    }

    public static TreeNode buildTree(){
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        g.right = h;
        c.right = f;
        return a;
    }

    public static void main(String[] args) {
        TreeNode treeNode = buildTree();
        prevOrder(treeNode);
        System.out.println();
        inOrder(treeNode);
        System.out.println();
        postOrder(treeNode);
    }
}
