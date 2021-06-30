package Package;
//请完成一个函数，输入一个二叉树，该函数输出它的镜像。

public class JZ27 {
    // 1、利用先序遍历，交换左右子树
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
