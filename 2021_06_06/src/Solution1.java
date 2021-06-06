public class Solution1 {
    public double Power(double base, int exponent) {
        if(base == 0){
            return 0;
        }
        if(exponent == 0){
            return 1;
        }
        double result = 1.0;
        if(exponent < 0){
            exponent = -exponent;
            base = 1/base;
        }
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
  }
}