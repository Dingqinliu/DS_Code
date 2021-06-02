import java.util.Stack;

public class JZ06 {
    public int[] reversePrint(ListNode head){
//        思路1 顺序遍历 但倒序存在数组中
//        思路2 用栈 利用先进后出


//        ListNode cur=head; //思路1
//        int count=0;
//        while(cur!=null){
//            count++;
//            cur=cur.next;
//        }
//        int[] array=new int[count];
//        cur=head;
//            for (int j=count-1;j>=0;j--){
//                array[j]=cur.val;
//                cur=cur.next;
//            }
//        return array;

        Stack<ListNode> stack=new Stack<ListNode>();
        ListNode cur=head;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }

        int size=stack.size();
        int[] array=new int[size];
        for (int j=0;j<size;j++){
            array[j]=stack.peek().val;
            stack.pop();
        }

        return array;
    }
}
