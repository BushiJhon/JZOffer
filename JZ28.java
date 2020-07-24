import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i], value+1);
            }else{
                map.put(array[i], 1);
            }
        }
        
        Iterator iter = map.keySet().iterator();
        int length = array.length / 2;
        while(iter.hasNext()){
            int i = (int)iter.next();
            if(map.get(i) > length){
                return i;
            }
        }
        return 0;
    }
}