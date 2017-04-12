# 解题思路：1，先将链表截断为两个相等长度的链表，如果链表长度为奇数，则第一条链表长度多1。如原链表为L={1,2,3,4,5}，那么拆分结果为L1={1,2,3}；L2={4,5}。拆分的技巧还是快慢指针的技巧。
#2，将第二条链表L2翻转，如将L2={4,5}翻转为L2={5,4}。
#3，按照题意归并链表。

# Definition for singly-linked list.

# class ListNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution(object):

    def reorderList(self, head):

        """

        :type head: ListNode

        :rtype: void Do not return anything, modify head in-place instead.

        """

        if head is None or head.next is None or head.next.next is None: return

        slow = fast = head

        while fast and fast.next:

            slow = slow.next

            fast = fast.next.next

        head1 = head

        head2 = slow.next

        slow.next = None

        dummy = ListNode(0); dummy.next = head2

        p = head2.next; head2.next = None

        while p:

            tmp = p; p = p.next

            tmp.next = dummy.next

            dummy.next = tmp

        head2 = dummy.next

        

        p1 = head1; p2 = head2

        while p2:

            tmp1 = p1.next; tmp2 = p2.next

            p1.next = p2; p2.next = tmp1

            p1 = tmp1; p2 = tmp2

        
