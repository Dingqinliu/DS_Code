//用两个栈实现队列
//分别完成在队列尾部插入整数 和在队列头部删除整数的功能

import java.util.LinkedList;
import java.util.Stack;

class CQueue {
    LinkedList<Integer> st1;
    LinkedList<Integer> st2;

    public CQueue(){
        st1=new LinkedList<>();
        st2=new LinkedList<>();
    }

    public void appendTail(int value){
        st1.add(value);
    }

    public int deleteHead(){
        if (st2.isEmpty()){
            if (st1.isEmpty()){
                return -1;
            }
            while (!st1.isEmpty()){
                st2.add(st1.pop());
            }
            return st2.pop();
        }
        else {
            return st2.pop();
        }
    }

}
