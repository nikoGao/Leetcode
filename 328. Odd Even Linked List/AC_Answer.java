/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode even = head, odd = head.next;
        int index = 2;
        int count = 0;
        while(odd !=null){
            if(index %2 == 1){
                ListNode temp = odd.next;
                ListNode mid = even.next;
                int i = count;
                while(i!=0){
                    mid = mid.next;
                    i--;
                }
                mid.next = temp;
                odd.next = even.next;
                even.next = odd;
                even = odd;
                odd = temp;
                count++;
            }else{
                odd = odd.next;
            }
            ++index;
        }
        return head;
    }
}
