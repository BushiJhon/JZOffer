import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k > input.length)
            return new ArrayList<Integer>();
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<input.length; i++){
            set.add(input[i]);
        }
        
        int[] newInput = new int [set.size()];
        Iterator it = set.iterator();
        int j=0;
        while(it.hasNext()){
            newInput[j++] = (int)it.next();
        }
        
        for(int i=0; i<newInput.length; i++){
            list.add(newInput[i]);
        }
        
        Collections.sort(list);
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<k; i++){
            result.add(list.get(i));
        }
        return result;
    }
}