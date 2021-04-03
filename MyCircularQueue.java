public class MyCircularQueue {
    private int[] array;//数组 保存数据
    private int frontIndex;//队首下标
    private int tailIndex;//队尾下标
    private int size;

    public static void main(String[] args) {
        MyCircularQueue CQ=new MyCircularQueue(5);
        MyCircularQueue cqNULL=new MyCircularQueue(0);
        CQ.enQueue(1);
        CQ.enQueue(2);
        CQ.enQueue(3);
        CQ.enQueue(4);
        System.out.println(CQ.enQueue(5));//true
        System.out.println(CQ.isFull());//true
        System.out.println(CQ.enQueue(6));//false

        CQ.deQueue();
        System.out.println(CQ.enQueue(6));//true

        System.out.println(CQ.Front());//2
        System.out.println(cqNULL.Front());//-1
        System.out.println(cqNULL.Rear());//-1
        System.out.println(cqNULL.isEmpty());//true
    }

    public MyCircularQueue(int k) {//k代表容量
        array=new int[k];
        frontIndex=0;
        tailIndex=0;
        size=0;
    }

    public boolean enQueue(int value) {
       if (isFull()){
           return false;//队列是满的 则插入失败
       }
       array[tailIndex]=value;//尾插
        tailIndex=(tailIndex+1)%array.length;//正常是tailIndex++ 此处取模即实现了循环
        size++;//每插入一个元素 size+1 保存对象的不可变性
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        frontIndex=(frontIndex+1)%array.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return array[frontIndex];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        int index=(tailIndex-1+array.length)%array.length;//+ 防止tailIndex-1后为负
        return array[index];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==array.length;//容量与数据个数相等 满
    }
}
