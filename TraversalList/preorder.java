import java.util.ArrayList;
import java.util.List;

public class preorder {
    List<Integer> list=new ArrayList<>();

    public void preorder(TreeNode root){
        if (root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preorderTraversel(TreeNode root){
        list.clear();
        preorder(root);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree();
        preorder p=new preorder();
        p.preorderTraversel(root);
    }
}
