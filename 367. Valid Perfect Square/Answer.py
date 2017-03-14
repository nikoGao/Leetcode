class Solution(object):

    def isPerfectSquare(self, num):

        """

        :type num: int

        :rtype: bool

        """

        start, end = 1, num

        mid = (start+end)/2

        if num == 0 or num == 1:

            return True

        while start < end and mid != start:

            if mid ** 2 == num:

                return True

            if mid ** 2 > num:

                end = mid

                mid = (start+end)/2

            else:

                start = mid

                mid = (start + end)/2

        return False
