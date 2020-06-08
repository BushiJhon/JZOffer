//思路：斐波那契数列升级版

public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 0)
            return 0;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        
        int all = 0;
        for(int i=target; i>0; i--){
            all += JumpFloorII(target-i);
        }
        
        return all+1;
    }
}