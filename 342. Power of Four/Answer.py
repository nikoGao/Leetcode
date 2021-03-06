import math

class Solution(object):

    def isPowerOfFour(self, num):

        """

        :type num: int

        :rtype: bool

        """

        return num > 0 and 4 ** round(math.log(num, 4)) == num
