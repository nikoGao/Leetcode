/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int start = 0;
        ListNode p = dummy;
        while(start+1<m){
            p = p.next;
            start++;
        }
        ListNode cur = p.next; 
        ListNode after = cur.next;
        for(int i=0; i<n-m; i++){
            cur.next = after.next;
            after.next = p.next;
            p.next = after;
            after = cur.next;
        }
        return dummy.next;
    }
    
}
