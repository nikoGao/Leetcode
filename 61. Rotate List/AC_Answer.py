#i循环右移一条链表，比如k=2，（1，2，3，4，5）循环右移两位变为（4，5，1，2，3）。由于k值有可能比链表长度大很多，所以先要用一个count变量求出链表的长度。而k%count就是循环右移的步数

# Definition for singly-linked list.

# class ListNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution(object):

    def rotateRight(self, head, k):

        """

        :type head: ListNode

        :type k: int

        :rtype: ListNode

        """

        if k == 0:

            return head

        if head == None:

            return head

        dummy = ListNode(0)

        dummy.next = head

        p = dummy

        count = 0

        while p.next:

            p = p.next

            count += 1

        "rotate the list"

        p.next = dummy.next 

        step = count - ( k % count )

        for i in range(0, step):

            p = p.next

        head = p.next

        p.next = None

        return head
