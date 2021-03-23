package 两个栈实现队列;
import java.util.*;

/**
 * 用两个栈实现队列思路：
 * stack1负责入队列
 * stack2负责出队列
 *
 * */
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public Integer pop() {
        if (isEmpty()){
            return null;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    private boolean isEmpty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}