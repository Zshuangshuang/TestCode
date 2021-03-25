package 复习.数值的整数次方;

public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0){
            return 0;
        }
        if (base == 0 && exponent == 0){
            return 0;
        }
        if (exponent == 0){
            return 1;
        }
        if (exponent < 0){
            base = 1/base;
            exponent = -exponent;
        }
        double total = 1.0;
        if (exponent > 0){
            for (; exponent >= 1; exponent--) {
                total *= base;
            }
        }
        return total;
  }
}