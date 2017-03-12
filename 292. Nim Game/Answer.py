#通过递推得，n为4的倍数时必输
class Solution(object):
    def canWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n % 4 != 0:
            return True
        return False
