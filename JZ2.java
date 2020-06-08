/*思路：
*	遍历StringBuffer,新建一个StringBuffer
*/

public class Solution {
    public String replaceSpace(StringBuffer str) {
    	        int length = str.length();
                
        StringBuffer new_str = new StringBuffer(3*length);
        for(int i=0; i<length; i++){
            if(str.charAt(i) == ' '){
                new_str.append("%20");
            }else{
                new_str.append(str.charAt(i));
            }
        }

        return new_str.toString();
    }
}