// Time 21ms, too slow
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(Integer.MIN_VALUE);
        ListNode res = new ListNode(Integer.MIN_VALUE);
        ListNode point = res;
        while(l1 !=null && l2 !=null){
            if (l1.val <=l2.val){
                ListNode temp = new ListNode(l1.val);
                res.next = temp;
                l1 = l1.next;
            }else if(l1.val > l2.val){
                ListNode temp = new ListNode(l2.val);
                res.next = temp;
                l2 = l2.next;
            }
            res = res.next;
        }
        if (l1 != null) p = l1;
        else if(l2 != null) p = l2;
        else return point.next;
        while(p != null && p.val >= res.val){
            res.next = new ListNode(p.val);
            res = res.next;
            p = p.next;
        }
       return point.next; 
    }
}
