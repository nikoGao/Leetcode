# Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode temp = new ListNode(-1000000);
        temp.next = head;
        ListNode start = head;
        while(start!=null){
            if(temp.val == start.val){
                start = start.next;
            }else{
                temp.next = start;
                temp = temp.next;
                start = start.next;
            }
        }
        if(temp.next !=null && start==null){
            temp.next =null;
        }
        return head;
    }
}
