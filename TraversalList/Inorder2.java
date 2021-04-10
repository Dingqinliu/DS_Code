import java.util.ArrayList;
import java.util.List;

public class Inorder2 {
   public List<Integer> inorderTraversal(TreeNode root){
       if (root==null){
           return new ArrayList<>();
       }

       List<Integer> list=new ArrayList<>();
       List<Integer> leftInorder=inorderTraversal(root.left);
       List<Integer> rightInorder=inorderTraversal(root.right);

       list.addAll(leftInorder);
       list.add(root.val);
       for (Integer e:rightInorder){
           list.add(e);
       }
       return list;
   }
}
