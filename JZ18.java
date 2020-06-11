public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        
        Mirror(root.left);
        Mirror(root.right);
        
        swapNode(root);
    }
    
    public void swapNode(TreeNode treeNode){
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
    }
}