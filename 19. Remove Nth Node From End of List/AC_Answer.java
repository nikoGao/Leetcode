/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode dummy = head;
        while(dummy != null){
            length++;
            dummy = dummy.next;
        }
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode prev = fake;
        int i=0;
        while(i<length-n){
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return fake.next;
    }
}
