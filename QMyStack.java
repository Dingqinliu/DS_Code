import java.util.LinkedList;
import java.util.Queue;

public class QMyStack {
    private Queue<Integer> queue1=new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public static void main(String[] args) {
        QMyStack stack=new QMyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        stack.push(4);
        System.out.println(stack.top());//4
        System.out.println(stack.empty());//false
    }
    public void push(int x) {//模拟压栈
        Queue<Integer> queue;
        if (!queue1.isEmpty()) {
            queue = queue1;
        } else if (!queue2.isEmpty()) {
            queue = queue2;
        } else {
            queue = queue2;
        }
        queue.add(x);
    }

    public int pop() {//模拟出栈
        Queue<Integer> queue;//指向不为空的队列
        Queue<Integer> toQueue;//指向为空的队列
        if (!queue1.isEmpty()) {
            queue = queue1;
            toQueue = queue2;
        } else {
            queue = queue2;
            toQueue = queue1;
        }
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int e = queue.remove();
            toQueue.add(e);//把不为空队列中除最后一个元素以外的其他元素全部移动到空的那个队列中
        }
        return queue.remove();//最后一个元素出队列 实现了后进先出
    }

    public int top() {//模拟拿到栈顶元素
        Queue<Integer> queue;
        Queue<Integer> toQueue;
        if (!queue1.isEmpty()) {
            queue = queue1;
            toQueue = queue2;
        } else {
            queue = queue2;
            toQueue = queue1;
        }
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int e = queue.remove();
            toQueue.add(e);
        }
        return queue.remove();
    }

    public boolean empty() {//模拟栈是否为空
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
