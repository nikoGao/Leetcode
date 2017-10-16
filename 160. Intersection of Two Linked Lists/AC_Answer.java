// First calculate the length of two strings, the longer one then move diff first, after that , both move, if in the end there is no common node, return null

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 1, len2 = 1;
        ListNode p1 = headA, p2 = headB;
        if(headA==null || headB==null) return null;
        while(headA.next != null){
            len1++;
            headA = headA.next;
        }
        while(headB.next != null){
            len2++;
            headB = headB.next;
        }
        if(len1>len2){
            int diff = len1 - len2;
            while(diff>0){
                p1 = p1.next;
                diff--;
            }
        }else if(len1<len2){
            int diff = len2 - len1;
            while(diff>0){
                p2 = p2.next;
                diff--;
            }
        }
        while(p1 !=null && p2 != null){
            if(p1 == p2) return p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
}
