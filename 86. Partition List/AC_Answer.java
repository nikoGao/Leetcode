/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode prev = dummy, h = dummy, cur = dummy.next;
        while(cur!=null){
            if(cur.val<x){
                if(h.next != cur){
                    prev.next = cur.next;
                    cur.next = h.next;
                    h.next = cur;
                    cur = prev.next;
                }else{
                    prev = cur;
                    cur = cur.next;
                }
                h = h.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
