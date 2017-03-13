#Use log3(n) == int to determine
import math

class Solution(object):

    def isPowerOfThree(self, n):

        """

        :type n: int

        :rtype: bool

        """

        return n > 0 and 3 ** round(math.log(n,3)) == n
