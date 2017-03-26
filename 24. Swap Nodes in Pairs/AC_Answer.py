# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        p = head
        while p and p.next:
            temp = p.val
            p.val = p.next.val
            p.next.val = temp
            p = p.next.next
        return head
