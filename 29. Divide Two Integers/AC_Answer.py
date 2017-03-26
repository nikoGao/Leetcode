import math
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        MAX_INT = 0X7FFFFFFF
        if dividend == 0:
            return 0
        log_res = float(math.log(abs(dividend), 2) - math.log(abs(divisor), 2))
        if (dividend < 0 and divisor > 0) or (dividend > 0 and divisor < 0):
            res = -int(2 ** log_res)
        else:
            res = int(2 ** log_res)
        if res > MAX_INT:
            return MAX_INT
        return res
