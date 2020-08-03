//动态规划算法

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int [] dp = new int [array.length];
        dp[0] = max;
        
        for(int i=1; i<array.length; i++){
            int newMax = dp[i-1] + array[i];
            
            if(newMax > array[i])
                dp[i] = newMax;
            else if(newMax < array[i])
                dp[i] = array[i];
            
            if(dp[i] > max)
                max = dp[i];
        }
        
        return max;
    }
}