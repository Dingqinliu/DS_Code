public class getIntersectionNode {
    public static void main(String[] args) {
        ListNode head1=new ListNode(4);
        ListNode n2=new ListNode(1);
        ListNode n3=new ListNode(8);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode head2=new ListNode(5);
        ListNode l2=new ListNode(0);
        ListNode l3=new ListNode(1);
        head1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        head2.next=l2;
        l2.next=l3;
        l3.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;//以上 按示例1构造两个链表
        System.out.println("链表1为：");
        print(head1);
        System.out.println("链表2为：");
        print(head2);
        System.out.println("两个链表相交的起始结点为：");
        ListNode startNode = get(head1, head2);
        System.out.println(startNode);
    }

    public static ListNode get(ListNode head1,ListNode head2){
        int count1=getCount(head1);//计算链表1长度
        int count2=getCount(head2);//计算链表2长度

        ListNode cur1=head1;
        ListNode cur2=head2;

        //以比较相同长度为基准
        if (count1>count2){
            for (int i=0;i<count1-count2;i++){
                cur1=cur1.next;
            }
        }
        else if (count2>count1){
            for (int i=0;i<count2-count1;i++){
                cur2=cur2.next;
            }
        }
        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur2;
    }

    private static int getCount(ListNode head) {//计算长度
        ListNode cur=head;
        int count=1;
        while (cur.next!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public static void print(ListNode head) {//打印
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.toString());
            cur = cur.next;
        }
    }
}
