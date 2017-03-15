# The guess API is already defined for you.

# @param num, your guess

# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0

# def guess(num):



class Solution(object):

    def guessNumber(self, n):

        """

        :type n: int

        :rtype: int

        """

        left, right = 1, n

        while left <= right:

            mid = (left + right)/2

            trial = guess(mid)

            if trial == -1:

                right = mid - 1

            elif trial == 1:

                left = mid + 1

            else:

                return mid
