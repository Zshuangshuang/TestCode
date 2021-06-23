package com.zss.review;

public class Demo3 {
    public static void show(int n){
        if (n > 9){
            show(n/10);
        }
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        show(124);
    }
}
