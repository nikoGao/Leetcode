#考察链表，指针循环，注意判断指针非空
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
        temp = head
        while temp != None:
            while temp.next != None and temp.next.val == temp.val:
                temp.next = temp.next.next
            temp = temp.next
        return head
