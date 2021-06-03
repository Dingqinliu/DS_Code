import java.util.Arrays;

public class JZ07 {
    //输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
    // 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    public TreeNode buildTree(int[] preorder, int[] inorder){
        int n = preorder.length; //前序数组的长度
        if (n == 0)
            return null;
        int rootVal = preorder[0], rootIndex = 0; //根节点的值 下标
        for (int i = 0; i < n; i++) { //前序数组和中序数组一样长
            if (inorder[i] == rootVal) { //找到中序里面的头结点 因为没有重复元素
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal); // 开始建树
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

        return root;
    }
}
