package Package;
//合并两个排序的链表
//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
//两个都是已经排序好的链表 那么两个指针 作比较 生成一个新的链表
public class JZ25 {
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        //链表类问题，设置dummyHead是一个常规操作，主要是为了避免讨论头节点，倒不一定是头节点丢失。
        //如果不用dummyHead，就需要去讨论头节点到底是l1还是l2。
        //迭代解法：
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy; //申请一个伪头结点
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
                cur=cur.next;
            }else {
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;
            }
        }
        if (l1==null){
            cur.next=l2;
        }else {
            cur.next=l1;
        }
        return dummy.next;
        //而如果是删除倒数第n个节点那个题，如果不采用dummyHead，你就需要单独去讨论如果删除的是倒数第n个节点，也就是head被删除的情况。
//        if (l1==null && l2!=null) return l2;  //法二 递归
//        if (l2==null && l1!=null) return l1;
//        if (l1==null && l2==null) return null;
//
//        if (l1.val<=l2.val){
//            l1.next=mergeTwoList(l1.next,l2);
//            return l1;
//        }else {
//            l2.next=mergeTwoList(l1,l2.next);
//            return l2;
//        }
    }
}
