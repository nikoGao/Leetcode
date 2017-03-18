class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        stair = []
        i = 1
        total = 0
        while n >= 0:
            total += i
            n -= i
            i += 1
        if total > n:
            return i-2
        return i-1
