import math
class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        flags = [True] * max(n,2)
        flags[0], flags[1] = False, False
        for i in range(2,int(math.sqrt(n))+1):
            if flags[i]:
                j = i*i
                while j < n:
                    flags[j] = False
                    j += i
        return sum(flags)
