# Run time 45ms(85.01%), space O(n), timeO(2n)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        slices = []
        fhead = ListNode(-100000)
        fhead.next = head
        p, q = fhead, fhead.next
        while q:
            if q.val >= x:
                p.next = q.next
                slices.append(q.val)
                q = q.next
            else:
                p = q
                q = q.next
        if slices:
            for each in slices:
                temp = ListNode(each)
                temp.next = None
                p.next = temp
                p = p.next
        return fhead.next
            
