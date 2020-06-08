/*思路：
*	非递减排序：1，2，2，3，6
*	寻找旋转后小于前一个数，小于等于后一个数
*/

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        else if(array.length == 1)
            return array[0];
        else if(array.length == 2){
            if(array[0] < array[1])
                return array[0];
            else
                return array[1];
        }

        for(int i=1; i<array.length; i++){
            if(array[i] < array[i-1] && array[i] <= array[i+1])
                return array[i];
        }

        return array[0];
    }
}