# Run time 62ms, space O(1), time O(n)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fhead = ListNode(-100000000)
        fhead.next = head
        p, q = fhead, fhead.next
        temp = fhead.val
        while q :
            if q.val == temp:
                p.next = q.next
                q = p.next
            elif q.next and q.next.val == q.val:
                temp = q.val
                p.next = q.next.next
                q = p.next
            else:
                p = p.next
                q = q.next
        return fhead.next
