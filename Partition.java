package pracLinkedList;

public class Partition {
    public static void main(String[] args) {
        ListNode n1=new ListNode(7);
        ListNode n2=new ListNode(8);
        ListNode n3=new ListNode(9);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(8);
        ListNode n6=new ListNode(12);
        ListNode pHead=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        System.out.println("原链表：");
        print(pHead);
        int x=5;
        ListNode partition = partition(pHead, 10);
        System.out.println("以"+x+"为基准对链表分割排序：");
        print(partition);

    }
    public static ListNode partition(ListNode pHead,int x){
        if(pHead == null){
            return null;
        }
        ListNode small = new ListNode(-1);
        ListNode  big = new ListNode(-1);
        ListNode cur = pHead, ps = small, pb = big;

        while(cur != null){
            if(cur.val < x){
                ps.next = cur;
                ps = ps.next;
            }else{
                pb.next = cur;
                pb = pb.next;
            }
            cur = cur.next;
        }

        pb.next = null;// 将最后的节点的指针域置为 null
        ps.next = big.next; // 将 smaller 链表最后一个节点的指针域放置 bigger 链表的头指针
        return small.next; // 返回头指针
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
