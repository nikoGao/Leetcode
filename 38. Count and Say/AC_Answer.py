# Test time: 52ms
# Use i to find elem, use j to label curr elem, the distance between i and j is the real number.

class Solution(object):

    def countNum(self, num):

        i, j = 0, 0

        res = ''

        while i<len(num):

            if num[i] != num[j]:

                res += str(i-j) + num[j]

                j = i

            else:

                i += 1

        res += str(i-j) + num[j]

        return res

        

    def countAndSay(self, n):

        """

        :type n: int

        :rtype: str

        """

        s = '1'

        for i in range(2, n+1):

            s = self.countNum(s)

        return s
