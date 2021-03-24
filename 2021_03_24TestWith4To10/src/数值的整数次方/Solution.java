package 数值的整数次方;

/**
 * 求解base的exponent次方
 * 首先得考虑exponent的正负
 * 如果exponent<0，那么就相当于计算base的(exponent)次方分之1
 *
 * */

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
        //解决当exponent小于0的情况
        if (exponent < 0){
            base = 1/base;
            exponent = -exponent;
        }
        double total = 1.0;
        if (exponent > 0){
            for (; exponent >= 1; exponent--) {
                total = base*total;
            }
        }
        return total;
  }
}