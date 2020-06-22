//思路：中序遍历，重点要有当前指针

public class Solution {
    public TreeNode nowHead = null;
    public TreeNode head = null;
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        
        Convert(pRootOfTree.left); //左
        
        if(nowHead == null){
            head = pRootOfTree;
            nowHead = pRootOfTree;
        }else{
            nowHead.right = pRootOfTree;
            pRootOfTree.left = nowHead;
            nowHead = pRootOfTree;
        }
        
        Convert(pRootOfTree.right); //右
        
        return head;
    }
}