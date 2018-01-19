/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int flag = 0, newval=0;
        while(l1 !=null || l2 !=null){
            if(l1==null){
                newval = l2.val + flag;
                l2 = l2.next;
            }
            else if(l2 == null){
                newval = l1.val + flag;
                l1 = l1.next;
            }
            else{
                newval = l1.val + l2.val + flag;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(newval>=10){
                flag = 1;
                newval -= 10;
            }else flag = 0;
            ListNode node = new ListNode(newval);
            dummy.next = node;
            dummy = dummy.next;
        }
        if(flag==1){
            ListNode node = new ListNode(flag);
            dummy.next = node;
        }
        return head.next;
    }
}
