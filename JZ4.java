/*思路：
*	采用递归重建二叉树
*	前序遍历：根左右
*	中序遍历：左根右
*	后续遍历：左右根
*
*/


public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null)
            return null;

        TreeNode treeNode = new TreeNode(pre[0]);
        int sign = 0;
        for(int i=0; i<in.length; i++){
            if(in[i] == pre[0]){
                sign = i;
                break;
            }
        }

        treeNode.left = reConstructBinaryTree(clonePreLeft(pre, sign), cloneInLeft(in, sign));
        treeNode.right = reConstructBinaryTree(clonePreRight(pre, sign), cloneInRight(in, sign));


        return treeNode;
    }

    public int[] clonePreLeft(int [] pre, int sign){
        int [] clonePre = new int[sign];

        if(clonePre.length == 0)
            return null;

        for(int i=1; i<=sign; i++) {
            clonePre[i - 1] = pre[i];
        }

        return clonePre;
    }

    public int[] cloneInLeft(int [] in, int sign){
        int [] cloneIn = new int[sign];

        if(cloneIn.length == 0)
            return null;

        for(int i=0; i<sign; i++){
            cloneIn[i] = in[i];
        }

        return cloneIn;
    }

    public int[] clonePreRight(int [] pre, int sign){
        int length = pre.length;
        int [] clonePre = new int[length - sign - 1];

        if(clonePre.length == 0)
            return null;

        for(int i=sign+1, j=0; i<length; i++, j++) {
            clonePre[j] = pre[i];
        }

        return clonePre;
    }

    public int[] cloneInRight(int [] in, int sign){
        int length = in.length;
        int [] cloneIn = new int[length - sign - 1];

        if(cloneIn.length == 0)
            return null;

        for(int i=sign+1, j=0; i<length; i++, j++){
            cloneIn[j] = in[i];
        }

        return cloneIn;
    }
}