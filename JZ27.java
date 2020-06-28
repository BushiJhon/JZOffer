//思路：递归+排序

import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> array = new ArrayList<>();
        int length = str.length();
        if(length == 0)
            return array;
        
        char [] chars = sort(str.toCharArray(), 0, length);
        recursive(0, length, chars, array);

        return array;
    }

    public char[] sort(char [] chars, int index, int length){

        for(int i=index; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        return chars;
    }

    public void recursive(int index, int length, char [] chars, ArrayList<String> array){
        if(index == length-1) {
            StringBuilder str = new StringBuilder();
            for(char c : chars){
                str.append(c);
            }
            array.add(str.toString());
            System.out.println(str.toString());
            return;
        }

        recursive(index+1, length, chars.clone(), array);
        for(int i=index+1; i<length; i++){
            if(chars[i] == chars[index])continue;
            else{
                char [] newChars = chars.clone();
                char temp = newChars[index];
                newChars[index] = newChars[i];
                newChars[i] = temp;
                sort(newChars, index+1, length);
                recursive(index+1, length, newChars, array);
            }
        }
    }
}