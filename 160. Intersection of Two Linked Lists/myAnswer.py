#@时间复杂度O(m+n),空间复杂度O(1)
#因为从交界点开始往后字符长度均相同，所以如果两个列表有长度差，则长的列表先前进diff距离后，两个指针共同开始遍历
#Definition for singly-linked list.

# class ListNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution(object):

    def getLength(self, head):

        i = 0

        while head != None:

            i += 1

            head = head.next

        return i

        

    def getIntersectionNode(self, headA, headB):

        """

        :type head1, head1: ListNode

        :rtype: ListNode

        """

        link1 = headA

        link2 = headB

        len1 = self.getLength(link1)

        len2 = self.getLength(link2)

        if len1 > len2:

            dis = len1 - len2

            for i in range(dis):

                link1 = link1.next

        else:

            dis = len2 - len1

            for i in range(dis):

                link2 = link2.next

        

        intersection = None

        while link1 and link2:

            if link1 == link2:

                return link1

            link1 = link1.next

            link2 = link2.next

        return intersection
