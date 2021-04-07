public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree();

        System.out.print("前序遍历：");
        preorder(root);
        System.out.println();

        System.out.print("中序遍历：");
       inorder(root);
        System.out.println();

        System.out.print("后序遍历：");
        postorder(root);
        System.out.println();
    }
    public static void preorder(TreeNode root) {//前序遍历
        if (root == null){
            return;
        }
        //遍历任意节点 只需打印根的值
        System.out.printf("%c ",root.val);
        //递归
        preorder(root.left);//root.left代表一整棵左子树
        preorder(root.right);
    }

    public static void inorder(TreeNode root){//中序遍历
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.printf("%c ",root.val);
        inorder(root.right);
    }
    public static void postorder(TreeNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%c ",root.val);
    }
}
