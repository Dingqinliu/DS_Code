package pracLinkedList;

public class DeleteDuplication {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(4);
        ListNode n6=new ListNode(4);
        ListNode n7=new ListNode(4);
        ListNode n8=new ListNode(5);
        ListNode head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=null;
        System.out.println("原链表的值：");
        print(head);
        ListNode delete = delete(head);
        System.out.println("删除重复结点后链表的值：");
        print(delete);
    }
    public static ListNode delete(ListNode pHead){
        if (pHead == null || pHead.next == null) { // 只有0个或1个结点，则返回
            return pHead;
        }
        if (pHead.val == pHead.next.val) { // 当前结点是重复结点
            ListNode pNode = pHead.next;
            while (pNode != null && pNode.val == pHead.val) {
                // 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
                pNode = pNode.next;
            }
            return delete(pNode); // 从第一个与当前结点不同的结点开始递归
        }
        else { // 当前结点不是重复结点
            pHead.next = delete(pHead.next); // 保留当前结点，从下一个结点开始递归
            return pHead;
        }
    }
    public static void print(ListNode head){
        ListNode cur=head;
        while (cur!=null){
            System.out.println(cur.toString());
            cur=cur.next;
        }
    }
}
