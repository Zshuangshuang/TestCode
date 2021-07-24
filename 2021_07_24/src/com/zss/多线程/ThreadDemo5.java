package com.zss.多线程;


public class ThreadDemo5 {
    public static void main(String[] args) {
        for (Thread.State state:Thread.State.values()){
            System.out.println(state);
        }
    }
}
