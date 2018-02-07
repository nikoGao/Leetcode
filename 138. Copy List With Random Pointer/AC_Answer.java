/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    Map<Integer, RandomListNode> map = new HashMap<>();
    public RandomListNode copyRandomList(RandomListNode head) {
        return copy(head);
    }
    
    public RandomListNode copy(RandomListNode head){
        if(head==null) return null;
        if(map.containsKey(head.label)) return map.get(head.label);
        
        RandomListNode c = new RandomListNode(head.label);
        map.put(c.label, c);
        c.next = copy(head.next);
        c.random = copy(head.random);
        return c;
    }
}
