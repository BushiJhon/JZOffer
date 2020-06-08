/*思路：
*	先遍历值存储
*	然后再逆序遍历存储
*
*/

public class ListNode {
	int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}


import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> form = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        
        if(listNode == null)
            return last;
        
        for(;;){
            if(listNode.next != null){
                form.add(listNode.val);
                listNode = listNode.next;
            }else{
                form.add(listNode.val);
                break;
            }
        }

        for(int i=form.size()-1; i>=0; i--){
            last.add(form.get(i));
        }

        return last;
    }
}