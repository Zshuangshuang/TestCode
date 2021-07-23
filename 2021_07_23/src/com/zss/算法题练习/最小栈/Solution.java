package com.zss.算法题练习.最小栈;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (minStack.isEmpty()){
            minStack.push(node);
        }else {
            int min = minStack.peek();
            if (node < min){
                min = node;
            }
            minStack.push(min);
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}