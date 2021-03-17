package pracLinkedList;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode n1=new ListNode(7);
        ListNode n2=new ListNode(8);
        ListNode n3=new ListNode(9);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(8);
        ListNode n6=new ListNode(12);
        ListNode head1=n1;
        ListNode head2=n4;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        System.out.println("第一条链表：");
        print(head1);
        System.out.println("第二条链表：");
        print(head2);
        ListNode merge = merge(head1, head2);
        System.out.println("合并后链表：");
        print(merge);
    }
    public static ListNode merge(ListNode l1,ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode temp = l1.val < l2.val ? l1 : l2;
        temp.next = merge(temp.next, l1.val >= l2.val ? l1 : l2);
        return temp;
    }
    public static void print(ListNode head){
        ListNode cur=head;
        while (cur!=null){
            System.out.println(cur.toString());
            //System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
