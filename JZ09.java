package review_2;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

//两个栈实现一个队列
//栈 Stack 先进后出 水杯结构
//队列 Queue 先进先出 排队结构
//用LinkedList作为栈的容器是因为：
// --------------------
// LinkedList 是一个继承于AbstractSequentialList的双向链表。
//LinkedList 可以被当作堆栈、队列或双端队列进行操作。
//LinkedList 实现 List 接口，所以能对它进行队列操作。
//LinkedList 实现 Deque 接口，能将LinkedList当作双端队列使用。
//LinkedList 实现了Cloneable接口，即覆盖了函数clone()，能克隆。
//LinkedList 实现java.io.Serializable接口，所以LinkedList支持序列化，能通过序列化去传输。
//LinkedList 是非同步的。
//————————————————
//如果你使用Stack的方式来做这道题，会造成速度较慢；
// 原因的话是Stack继承了Vector接口，而Vector底层是一个Object[]数组，那么就要考虑空间扩容和移位的问题了。
// 可以使用LinkedList来做Stack的容器，因为LinkedList实现了Deque接口，所以Stack能做的事LinkedList都能做，
// 其本身结构是个双向链表，扩容消耗少。 但是我的意思不是像100%代码那样直接使用一个LinkedList当做队列，那确实是快，但是不符题意。
class CQueue{
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue(){
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.add(value);
    }

    public int deleteHead(){
        if (stack1.isEmpty()){
            if (stack2.isEmpty()){
                return -1;
            }
            while (!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }
            return stack1.pop();
        }else {
            stack1.add(stack2.pop());
            return stack1.pop();
        }

    }
}