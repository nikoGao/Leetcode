#若为2的幂次，则二进制形式中，除了第一位为1，其余都为0， 则 n &(n-1)==0
class Solution(object):

    def isPowerOfTwo(self, n):

        """

        :type n: int

        :rtype: bool

        """

        return n > 0 and n & (n-1) == 0
