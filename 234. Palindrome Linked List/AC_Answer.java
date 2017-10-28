// Need to reverse half of the List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head !=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode fast = head, slow=head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) //odd node
            slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while(slow !=null){
            if(fast.val==slow.val){
                fast = fast.next;
                slow = slow.next;
            }else return false;
        }
        return true;
        
    }
}
