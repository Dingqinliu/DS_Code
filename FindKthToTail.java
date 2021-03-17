package pracLinkedList;

public class FindKthToTail {
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
        print(head);
        int k=3;
        findK(head,3);
        ListNode Knode = findK(head,k);
        System.out.println("倒数第"+k+"个结点是：");
        System.out.println(Knode);
    }
    // 1
    public static ListNode findK(ListNode head,int k){
    ListNode front = head;
    ListNode back = head;

    // 往后 k 步
        for (int i = 0; i < k; i++) {
        if (front == null) {
            return null;
        }
        front = front.next;
    }

        while (front != null) {
        front = front.next;
        back = back.next;
    }
        return back;
}
// 2
    public ListNode findK2(ListNode head, int k) {
        int len = length(head);
        if (len < k) {
            return null;
        }
        int step = len - k;
        ListNode cur = head;
        for (int i = 0; i < step; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private int length(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }

        return len;
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
