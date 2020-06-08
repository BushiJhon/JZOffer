public class Solution {
    public void reOrderArray(int [] array) {
        int [] odd = new int[array.length];
        int oddCount = 0;

        int [] even = new int [array.length];
        int evenCount = 0;

        for(int i=0; i<array.length; i++){
            if(!judgeEven(array[i]))
                odd[oddCount++] = array[i];
            else
                even[evenCount++] = array[i];
        }

        for(int i=0; i<oddCount;i++)
            array[i] = odd[i];
        
        for(int i=0; i<evenCount;i++)
            array[oddCount+i] = even[i];
        
    }
    
    public boolean judgeEven(int n){
        return n%2 == 0;
    }
}