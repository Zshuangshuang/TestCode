package 复习.整数的次方;

public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0){
            return 0;
        }
        if (exponent == 0 && base == 0){
            return 0;
        }
        if (exponent == 0){
            return 1;
        }
        if (exponent < 0){
            base = 1/base;
            exponent = -exponent;
        }
        double result = 1.0;
        if (exponent > 0){
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        }
        return result;
  }
}