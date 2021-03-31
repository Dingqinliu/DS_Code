package MyLinkedList;

//双向链表
public class Node {
    public String val;
    public Node next;//后继结点
    public Node prev;//前驱结点

    public Node(String val) {
        this.val = val;
    }
}
