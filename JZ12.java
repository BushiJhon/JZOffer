public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return (double)1;
        else if(exponent == 1)
            return base;
        else if(exponent < 0){
            base = 1.0/base;
            exponent = -exponent;
        }
        
        double result = base;
        
        for(int i=2; i<=exponent; i++){
            result *= base;
        }
        
        return result;
  }
}