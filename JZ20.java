//思路：需要建立栈来存储最小值，防止原数据栈弹出最小值

import java.util.Stack;

public class Solution {

    Stack stack = new Stack();
    Stack mins = new Stack();
    public void push(int node) {
        if(stack.empty() || (int)mins.peek() > node)
            mins.push(node);
        
        stack.push(node);
    }
    
    public void pop() {
        if((int)stack.peek() == (int)mins.peek())
            mins.pop();
        stack.pop();
    }
    
    public int top() {
        return (int)stack.peek();
    }
    
    public int min() {
        return (int)mins.peek();
    }
}