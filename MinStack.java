import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MinStack stack=new MinStack();
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.getMin());//2
        stack.pop();
        System.out.println(stack.top());//3
    }

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public void push(int x){
        stack.push(x);//将元素 x 推入栈中
        if (minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
        else {
            minStack.push(minStack.peek());
        }
    }
    public void pop(){//删除栈顶的元素
        stack.pop();
        minStack.pop();

    }
    public int top(){//获取栈顶元素
        return stack.peek();
    }
    public int getMin(){//检索栈中的最小元素
        return minStack.peek();
    }
}
