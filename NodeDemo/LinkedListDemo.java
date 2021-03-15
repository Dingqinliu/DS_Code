package NodeDemo;

public class LinkedListDemo {
    //头插
    public static Node pushFront(Node head,int val){
        Node node=new Node(val);
        node.next=head;
        return node;
    }
    //头删
    public static Node popFront(Node head){
        return head.next;
    }
    //尾插
    public static Node pushBack(Node head,int val){
        Node node=new Node(val);
        if (head!=null){
            Node last=head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=node;
            return head;
        }else {
            return node;
        }
    }
    //尾删
    public static Node popBack(Node head){
       if (head.next==null){
           return null;
       }
       else {
           Node last=head;
           if (last.next.next!=null){
               last=last.next;
           }
           last.next=null;
           return head;
       }
    }
    public static void printLinkedList(Node head){
        Node cur=head;
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }

    public static void main(String[] args) {
        Node head=null;
        head=pushBack(head,1);
        head=pushBack(head,2);
        head=pushBack(head,5);
        head=pushBack(head,3);
        printLinkedList(head);
    }
}
