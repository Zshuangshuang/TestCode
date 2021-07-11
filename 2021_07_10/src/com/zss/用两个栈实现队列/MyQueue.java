package com.zss.用两个栈实现队列;

import java.util.Stack;

class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    public void push(int x) {
        while (!B.isEmpty()){
            A.push(B.pop());
        }
        A.push(x);
    }
    

    public Integer pop() {
        if (empty()){
            return null;
        }
        while (!A.isEmpty()){
            B.push(A.pop());
        }
        return B.pop();
    }
    

    public Integer peek() {
        if (empty()){
            return null;
        }
        while (!A.isEmpty()){
            B.push(A.pop());
        }
        return B.peek();
    }
    

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}