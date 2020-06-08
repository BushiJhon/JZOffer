//思路：计算出总节点数

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null)
            return head;
        else if(k == 0)
            return null;
        
        int count = 1;
        ListNode listNode = head;

        while(head.next != null){
            head = head.next;
            count++;
        }
        count = count - k;
        if(count < 0)
            return null;
        
        for(int i=0; i<count; i++){
            listNode = listNode.next;
        }

        System.out.println(listNode.val);
        return listNode;
    }
}