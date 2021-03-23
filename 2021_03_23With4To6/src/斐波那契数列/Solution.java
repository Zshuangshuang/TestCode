package 斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        if (n<=0){
            return 0;
        }
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= n; i++) {
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }
}