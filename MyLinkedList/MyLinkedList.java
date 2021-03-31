package MyLinkedList;

public class MyLinkedList {
    //对象的不可变性 size永远表示结点个数 head永远指向头结点 last永远指向尾结点
    public int size;
    public Node head;//头结点
    public Node last;//尾结点

    public MyLinkedList(){ //一个空链表
        size=0;
        head=null;
        last=null;
    }

    //尾插 时间复杂度O(1)
    public boolean add( String e) {
        //先创一个结点
        Node node=new Node(e);
        if (head==null){
            head=last=node;
        }else {
            node.prev=last;
            last.next=node;
            last=node;
        }
        size++;//保持对象不可变性 所以更新结点个数
        return true;
    }

    //指定位置插入
    public void add(int index,String e){
        Node node=new Node(e);
        //下标不合法
        if (index<0||index>size()){
            throw new ArrayIndexOutOfBoundsException("下标超出范围");
        }
        //为空
        if (size()==0){
            head=last=node;
        }else if (index==0){ //头插
            head.prev=node;
            node.next=head;
            head=node;
        }
        else if (index==size()){ //尾插
            add(e);
            size--;
        }else { //除头尾外任意
            Node prev=head;
            //从头结点向后移动index-1步 找到待插入位置的前驱结点
            for (int i=0;i<index-1;i++){
                prev=prev.next;
            }
            Node next=prev.next;//待插入位置原来的结点
            prev.next=node;
            node.prev=prev;
            next.prev=node;
            node.next=next;
            node.prev=prev;
        }
        size++;
    }


    private int size() {
        return size;//空间换时间
    }

    public String remove(int index) {
        String e;
        if (index<0||index>=size()){
            throw new ArrayIndexOutOfBoundsException("下标不合法");
        }
        if (size()==1){//只有一个结点
            e=last.val;
            head=last=null;
        }else if (index==0){ //头删
            e=head.val;
            head=head.next;
            head.prev=null;
        }else if (index==size()-1){//尾删
            e=last.val;
            last=last.prev;
            last.next=null;
        }else {
            Node del=head;
            //从头结点向后移动index步 找到待删除位置的结点
            for (int i=0;i<index;i++){
                del=del.next;
            }
            e=del.val;
            Node prev=del.prev;//待删除结点的前一个结点
            Node next=del.next;//待删除结点的后一个结点
            prev.next=next;
            next.prev=prev;
        }
        size--;
        return e;
    }

    //删除第一次出现的指定元素的第一个出现（如果存在）。
    public boolean remove(String e){
        int i=indexOf(e);
        if (i>=0){
            remove(i);
            return true;
        }
        return false;
    }

    public boolean contains(String e) {
        for (Node cur=head;cur!=null;cur=cur.next){
            if (cur.val.equals(e)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(String e) {// 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1
        int i=0;
        for (Node cur=head;cur!=null;cur=cur.next){
            if(cur.val.equals(e)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(String e) {
        int i=size()-1;
        for (Node cur=last;cur!=null;cur=cur.prev){
            if (cur.val.equals(e)){
                return i;
            }
            i--;
        }
        return -1;
    }

    public void clear(){
        head=null;
        last=null;
        size=0;
    }

    public boolean isEmpty() {
        return size==0;
    }

    //得到目标索引的结点值 O(n)
    public String get(int index) {
        if (index<0||index>=size()){
            throw new ArrayIndexOutOfBoundsException("超出索引范围");
        }
        Node cur=head;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }

    //用指定的元素替换此列表中指定位置的元素
    // 注意返回值是该位置被替换的元素       O(n)
    public String set(int index, String e) {
        if (index<0||index>=size()){
            throw new ArrayIndexOutOfBoundsException("超出索引范围");
        }
        Node cur=head;
        for (int i=0;i<index;i++){
           cur=cur.next;
        }
        String old=cur.val;
        cur.val=e;
        return old;
    }


    @Override
    public String toString() {
        // String 对象是不可变对象
        // 使用 StringBuilder 进行连接
        StringBuilder s=new StringBuilder("{");
        Node cur=head;

        while (cur!=null){
            s.append(cur.val);
            if (cur!=last){
                s.append(",");
            }
            cur=cur.next;
        }
        s.append("}");
        return s.toString();
    }
}
