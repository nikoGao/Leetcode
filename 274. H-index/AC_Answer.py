# O(n) time, O(n) space

class Solution(object):

    def hIndex(self, citations):

        """

        :type citations: List[int]

        :rtype: int

        """

        n = len(citations)

        temp = [0]*(n+1)

        for c in citations:

            if c >= n:

                temp[n] += 1

            else:

                temp[c] += 1

        i = n-1

        while i >= 0:

            temp[i] += temp[i+1]

            if temp[i+1] >= i+1:

                return i + 1

            i -= 1

        return 0

        
