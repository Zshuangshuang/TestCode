package com.zss.斐波那契数列;


public class Solution {
    public int Fibonacci(int n) {
        /*if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);*/
        if (n <= 0){
            return 0;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1+f2;
            f1 =  f2;
            f2 = f3;
        }
        return f2;
    }
}