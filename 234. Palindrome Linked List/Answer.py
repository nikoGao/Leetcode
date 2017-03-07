#Defintion for singly-linked list.

# class ListNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.next = None



class Solution(object):

    def isPalindrome(self, head):

        """

        :type head: ListNode

        :rtype: bool

        """

        list1 = []

        while head:

            list1.append(head.val)

            head = head.next

        start, end = 0, len(list1)-1

        while start < end:

            if list1[start] == list1[end]:

                start += 1

                end -= 1

            else:

                return False

        return True
