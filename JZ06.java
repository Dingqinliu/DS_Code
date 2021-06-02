import java.util.Stack;

public class JZ06 {
    public int[] reversePrint(ListNode head){
//        思路1 顺序遍历 但倒序存在数组中
//        思路2 用栈 利用先进后出


        ListNode cur=head; //思路1
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int[] array=new int[count];
        cur=head;
            for (int j=count-1;j>=0;j--){
                array[j]=cur.val;
                cur=cur.next;
            }
        return array;


    }
}
