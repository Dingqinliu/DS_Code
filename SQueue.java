import java.util.Stack;

public class SQueue {
    public static void main(String[] args) {
        SQueue q = new SQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());//1
        System.out.println(q.pop());//2
        q.push(4);
        System.out.println(q.peek());//3
        System.out.println(q.empty());//false
    }

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {//将元素 x 推到队列的末尾
        stack2.push(x);
    }

    public int pop() {//从队列的开头移除并返回元素
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()){
                int e=stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.pop();
    }
    public int peek(){//返回队列开头的元素
        if (stack1.isEmpty()){
            while (!stack2.isEmpty()){
                int e=stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.peek();
    }
    public boolean empty(){
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
