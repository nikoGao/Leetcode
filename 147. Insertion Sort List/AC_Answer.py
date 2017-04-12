# Run time 459ms
# Definition for singly-linked list.

# class ListNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution(object):

    def insertionSortList(self, head):

        """

        :type head: ListNode

        :rtype: ListNode

        """

        if head is None or head.next is None: return head

        p, q = head, head.next

        p.next = None

        dummy = ListNode(0)

        dummy.next = p

        res = dummy

        while q:

            dummy, p = res, res.next

            while p:

                if q.val <= p.val:

                    tmp = q; q = q.next

                    tmp.next = p

                    dummy.next = tmp

                    break

                else:

                    dummy = dummy.next

                    p = p.next

            if dummy.next is None:

                tmp = q; q = q.next

                dummy.next = tmp

                tmp.next = None

        return res.next

        

        
