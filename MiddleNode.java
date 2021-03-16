package pracLinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        System.out.println("原链表的值");
        printLinkedList(head);
        ListNode mNode = middleNode(head);
        System.out.println("中间结点是：");
        System.out.println(mNode);
    }

    private static int length(ListNode head){
        int len=0;
        for (ListNode cur=head; cur!=null;cur=cur.next){
            len++;
        }
        return len;
    }

    public static void printLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }

    }

    //法1
    public static ListNode middleNode (ListNode head){
        int len=length(head);
        ListNode cur=head;
        for (int i=0;i<len/2;i++){ //往后len/2步
            cur=cur.next;
        }
        return cur;
    }
    //法2
    public static ListNode middleNode2(ListNode head){
        ListNode N1=head;
        ListNode N2=head;

        while (N2!=null){
            N2=N2.next;
            if (N2==null){
                break;
            }
            N2=N2.next;
            N1=N1.next;
        }
        return N1;
    }

}
