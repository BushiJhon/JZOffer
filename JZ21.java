//思路：重新模仿栈压入弹出的过程

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean is = false;

        Stack stack = new Stack();
        int countPop = 0;
        int countPush = 0;

        while(true){
            if(countPush < pushA.length)
                stack.push(pushA[countPush++]);

            if(stack.empty())
                break;

            if((int)stack.peek() == popA[countPop]){
                stack.pop();
                countPop++;

            }else if(countPush == pushA.length && (int)stack.peek() != popA[countPop]){
                break;
            }
        }

        if(stack.empty())
            is = true;

        return is;
    }
}