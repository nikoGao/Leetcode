/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast = head, slow = head;
        boolean circle = false;
        while(fast!=null && slow!=null){
            slow = slow.next;
            if(fast.next==null) return null;
            fast = fast.next.next;
            if(fast==slow){
                circle = true;
                break;
            }
        }
        if(!circle) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
