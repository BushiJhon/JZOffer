//思路：使用队列实现

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            list.add(temp.val);
            
            if(temp.left != null)
                queue.add(temp.left);
            
            if(temp.right != null)
                queue.add(temp.right);
        }
        
        return list;
    }
    
}