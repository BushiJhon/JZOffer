/*思路：
*	使用一个map将原链表与新链表对应，采用空间换时间的方法
*/

import java.util.HashMap;

public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)
            return null;
        
        HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<>();
        
        RandomListNode head = new RandomListNode(pHead.label);
        RandomListNode result = head;
        RandomListNode headSign = head;
        RandomListNode pHeadSign = pHead;
        
        hashMap.put(pHead, head);
        pHead = pHead.next;
        int count = 0;
        while(pHead != null){
            RandomListNode node = new RandomListNode(pHead.label);
            head.next = node;
            head = head.next;
            hashMap.put(pHead, head);
            pHead = pHead.next;
            count++;
        }
        
        while(headSign != null){
            RandomListNode node = hashMap.get(pHeadSign.random);
            headSign.random = node;
            
            headSign = headSign.next;
            pHeadSign = pHeadSign.next;
        }
        
        return result;
    }
}