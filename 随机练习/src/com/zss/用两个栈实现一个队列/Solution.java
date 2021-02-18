package com.zss.用两个栈实现一个队列;


import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
      while (!stack2.isEmpty()){
          int ret = stack2.pop();
          stack1.push(ret);
      }
      stack1.push(node);
    }
   private boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
   }
    public Integer pop() {
        if (empty()){
            return null;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
