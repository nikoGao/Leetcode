# Actually, this question is to find common number between m and n, so what w need to do is to right move 1 bit each time, and to verify whether they are same

class Solution(object):

    def rangeBitwiseAnd(self, m, n):

        """

        :type m: int

        :type n: int

        :rtype: int

        """

        i = 0

        while m != n:

            m = m >> 1

            n = n >> 1

            i += 1

        return n << i
