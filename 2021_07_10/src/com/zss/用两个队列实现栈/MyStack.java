package com.zss.用两个队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    public void push(int x) {
        A.offer(x);
    }
    

    public Integer pop() {
        if (empty()){
            return null;
        }
        while (A.size() > 1){
            int ret = A.poll();
            B.offer(ret);
        }
        int ret = A.poll();
        swapAB();
        return ret;
    }

    private void swapAB() {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }


    public Integer top() {
        if (empty()){
            return null;
        }
        while (A.size() > 1){
            int ret = A.poll();
            B.offer(ret);
        }
        int ret = A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }
    

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}