class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        MAX_INT = 2**31;
        if abs(x) >MAX_INT:
            return 0
        sign = 0
        if x < 0:
            sign = 1
            x = abs(x)
        res = 0
        while(x):
            res = res*10 + x%10
            x /= 10
        if res > MAX_INT:
            return 0
        elif sign:
            return -res
        else:
            return res
        
