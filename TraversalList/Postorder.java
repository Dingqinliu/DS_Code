import java.util.ArrayList;
import java.util.List;

public class Postorder {
    List<Integer> list=new ArrayList<>();

    public void postorder(TreeNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }

    public List<Integer> postorderTraversel(TreeNode root){
        list.clear();
        postorder(root);
        return list;
    }
}
