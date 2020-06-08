/*思路：
*     先找出第一列小于寻找数
*     再找出最后一列大于寻找数的行
*     最后再在这些行里遍历
*/

public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if(col == 0){
            return false;
        }
        int [] row_sign = new int[row];

        for(int i=0; i<row; i++){
            if(array[i][0] < target && array[i][col-1] > target){
                row_sign[i] = 0;
            }else if(array[i][0] == target || array[i][col-1] == target){
                return true;
            }else{
                row_sign[i] = -1;
            }
        }

        for(int i=0; i<row; i++){
            if(row_sign[i] == 0){
                for(int j=1; j<col-1; j++){
                    if(array[i][j] == target){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}