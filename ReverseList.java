package pracLinkedList;

public class ReverseList {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        System.out.println("原链表的值");
        print(head,head.val);
        ListNode node1 = reverseList(head);
        System.out.println("反转后的链表值");
        print(node1,node1.val);
    }
    public static ListNode reverseList(ListNode head){
       ListNode pre=null;
       ListNode cur=head;
       while (cur!=null){
           ListNode next=cur.next;
           cur.next=pre;
           pre=cur;
           cur=next;
       }
       return pre;
    }
    public static void print(ListNode head,int var){
        ListNode cur=head;
        while (cur!=null){
            System.out.println(cur.toString());
            //System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
