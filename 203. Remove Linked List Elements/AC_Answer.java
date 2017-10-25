/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode point1=new ListNode(Integer.MIN_VALUE);
        point1.next = head;
        ListNode point2 = point1;
        while(point1.next!=null){
            if(point1.next.val==val){
                point1.next = point1.next.next;
            }else{
                point1 = point1.next;
            }
        }
        return point2.next;
    }
}
