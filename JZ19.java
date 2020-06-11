/*思路：
*	一圈一圈的打印
*	每次标记起点
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int start = 0;
        while(!printCircle(start, matrix, list)){
            start += 1;
        }
        
        return list;
    }
    
    public boolean printCircle(int start, int [][] matrix, ArrayList<Integer> list){
        int row = matrix.length - start*2;
        int col = matrix[0].length - start*2;
        
        if(row == 0 || col == 0)
            return true;
        
        if(row == 1){
            for(int i=start; i<start + col; i++){
                list.add(matrix[start][i]);
            }
            return true;
        }
        
        if(col == 1){
            for(int i=start; i<start + row; i++){
                list.add(matrix[i][start]);
            }
            return true;
        }
        
       for(int i=start; i<start + col; i++){
           list.add(matrix[start][i]);
       }
        
        for(int i=start+1; i<start + row; i++){
            list.add(matrix[i][start + col-1]);
        }
        
        for(int i=start + col-2; i>=start; i--){
            list.add(matrix[start + row-1][i]);
        }
        
        for(int i=start + row-2; i>start; i--){
            list.add(matrix[i][start]);
        }
        
        return false;
    }
}