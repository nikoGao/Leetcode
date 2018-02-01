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
        Map<Integer, Integer> elems = new HashMap<>();
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur!=null){
            while(cur.next!=null && cur.val==cur.next.val){
                cur = cur.next;
            }
            if(prev.next==cur){
                prev = cur;
            }else{
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
