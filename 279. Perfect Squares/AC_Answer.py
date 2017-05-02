# Use Number Theory: Lagrange's Four-Square Theorem
# Every number can be represented as the sum of four square numbers.
# First, if the num has factory 4, remove all 4s
# Then, if a num divide 8 rest 7, then it is absolutely composed by 4 square numbers.
# Last, try to divide it into two square numbers, if success and no num is 0, return 2, else 1
# If can not be divided into 2, then return 3
# Run time 52ms

class Solution(object):
    def numSquares(self, n):
        """
        :type n: int
        :rtype: int
        """
        while n%4 == 0:
            n /= 4
        if n%8 == 7: return 4
        for i in range(0, int(math.sqrt(n))+1):
            temp = int(math.sqrt(n - i**2))
            if i**2 + temp**2 == n:
                if type(i) is int and type(temp) is int and i*temp != 0:
                    return 2
                else:
                    return 1
        return 3
            
