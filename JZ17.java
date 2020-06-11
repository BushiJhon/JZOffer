//思路：递归

public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null || root1 == null)
            return false;

        boolean has = false;
        if(root1.val != root2.val){
            has = HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }else if(root1.val == root2.val){
            if(isSubtree(root1, root2))
                return true;
            else
                has = HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }

        return has;
    }
    
    public boolean isSubtree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 != null)
            return false;
        
        if(root2 == null)
            return true;

        boolean is = false;
        if(root1.val == root2.val){
            is = isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        }

        return is;
    }
}