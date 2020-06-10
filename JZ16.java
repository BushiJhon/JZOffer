//思路：归并，一个个判断装桶

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)return list2;
        else if(list2 == null)return list1;
        
        ListNode result = null, list = null;
        if(list1.val <= list2.val){
            result = list = list1;
            list1 = list1.next;
        }
        else{
            result = list = list2;
            list2 = list2.next;
        }

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                list.next = list1;
                list = list.next;
                list1 = list1.next;
            }else{
                list.next = list2;
                list = list.next;
                list2 = list2.next;
            }
        }

        if(list1 == null)
            list.next = list2;
        else if(list2 == null)
            list.next = list1;

        return result;
    }
}