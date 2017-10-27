//Use recursion, each loop ,get nextNode and a new return list, just add curNode to next Node and return new-already-linked-list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode nextNode = head.next;
        ListNode newList = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newList;
    }
}
