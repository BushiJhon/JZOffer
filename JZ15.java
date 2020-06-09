//思路: 将链表前后记录，然后重定向

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        
        ListNode listNode1 = head;
        ListNode listNode2 = head.next;
        
        while(listNode2.next != null){
            ListNode temp = listNode2.next;
            listNode2.next = listNode1;
            listNode1 = listNode2;
            listNode2 = temp;
        }
        
        listNode2.next = listNode1;
        head.next = null;
        return listNode2;
    }
}