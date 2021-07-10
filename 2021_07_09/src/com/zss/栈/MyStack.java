package com.zss.栈;



public class MyStack {
    public int[] array = new int[100];
    public int size = 0;
    public void push(int x){
        array[size] = x;
        size++;
    }
    public int peek(){
        return array[size-1];
    }
    public int pop(){
        int ret = array[size-1];
        size--;
        return ret;
    }
    public static void main(String[] args) {

    }
}
