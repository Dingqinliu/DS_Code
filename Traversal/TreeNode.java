public class TreeNode {
    public int val;//节点值
    public TreeNode left;//指向该节点的左孩子 null表示无左孩子 进一步视为左子树
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("TreeNode{%c}",val);
    }
}
