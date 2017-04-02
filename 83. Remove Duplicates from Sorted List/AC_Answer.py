# Run time:55ms(90%)
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
        add = ListNode(0)
        add.next = head
        p = add.next
        while p and p.next:
            if p.next.val == p.val:
                p.next = p.next.next
            else:
                p = p.next
        return add.next
