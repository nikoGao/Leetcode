#n!后缀0的个数 = n!质因子中5的个数
#              = floor(n/5) + floor(n/25) + floor(n/125) + ...
#移除诸如25，125等中额外的5
class Solution(object):

    def trailingZeroes(self, n):

        """

        :type n: int

        :rtype: int

        """

        x = 5

        ans = 0

        while n >= x:

            ans += n/x

            x *= 5

        return ans
