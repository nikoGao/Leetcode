# Linked List Part Reversion, use Build block thinking.
# Note, the point will be moving with ListNode
# Run time 52ms
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
        fhead = ListNode(0)
        fhead.next = head
        p = fhead
        for i in range(m-1):
            p = p.next
        curr = p.next    
        for i in range(n-m):
            temp = curr.next
            curr.next = temp.next
            temp.next = p.next
            p.next = temp
            
        return fhead.next
