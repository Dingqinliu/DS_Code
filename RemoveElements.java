package pracLinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode n3=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n5=new ListNode(5);
        ListNode n=new ListNode(2);
        ListNode head=n3;
        n3.next=n2;
        n2.next=n5;
        n5.next=n;
        n.next=null;
        System.out.println("原链表的值");
        print(head,head.val);
        ListNode node1 = removeElements(n3, 2);
        System.out.println("删掉元素2后的链表值");
        print(node1,node1.val);

    }

    public static ListNode removeElements(ListNode head,int val){
        //判断链表是否为空
        if (head==null){
            return null;
        }
        //判断除头结点外的所有结点
        ListNode cur=head;
        while (cur.next!=null){
            if (cur.next.val!=val){
                cur=cur.next;
            }
            else {
                cur.next=cur.next.next;
            }
        }
        //单独判断头结点
        if (head.val==val){
            return head.next;
        }
        else {
            return head;
        }
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
