package com.zss.review;


public class Demo4 {
    public static int sum(int n){
        if (n < 10){
            return n;
        }
        return sum(n/10)+sum(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sum(911));
    }
}
