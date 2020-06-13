//思路：使用栈来记录

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        Stack<ArrayList<Integer>> arrayStack = new Stack<>();
        Stack<TreeNode> treeStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root ==null)
            return list;
        
        treeStack.push(root);
        countStack.push(root.val);
        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(root.val);
        arrayStack.push(subList);
        while(!treeStack.empty()){
            int count = (int)countStack.peek();
            TreeNode temp = (TreeNode)treeStack.peek();
            ArrayList<Integer> tempList = (ArrayList<Integer>)arrayStack.peek();
            if(count != target){
                countStack.pop();
                treeStack.pop();
                arrayStack.pop();
                
                if(temp.right !=null){
                    countStack.push(temp.right.val + count);
                    
                    treeStack.push(temp.right);
                    
                    ArrayList<Integer> rightTempList = (ArrayList<Integer>)tempList.clone();
                    rightTempList.add(temp.right.val);
                    arrayStack.push(rightTempList);
                }

                if(temp.left !=null){
                    countStack.push(temp.left.val + count);
                    
                    treeStack.push(temp.left);
                    
                    ArrayList<Integer> leftTempList = (ArrayList<Integer>)tempList.clone();
                    leftTempList.add(temp.left.val);
                    arrayStack.push(leftTempList);
                }

            }else{
                if(temp.left ==null && temp.right ==null)
                    list.add(tempList);
                treeStack.pop();
                arrayStack.pop();
                countStack.pop();
            }
        }
        return list;
    }
}