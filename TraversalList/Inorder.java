import java.util.ArrayList;
import java.util.List;

public class Inorder {
    List<Integer> list=new ArrayList<>();

    public void inorder(TreeNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root){
        list.clear();
        inorder(root);
        return list;
    }
}
