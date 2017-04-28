# Division, just to notice the last output

class Solution(object):

    def hIndex(self, citations):

        """

        :type citations: List[int]

        :rtype: int

        """

        n = len(citations)

        start, end = 0, n-1

        while start <= end:

            mid = (start+end)/2

            if citations[mid] == n-mid: return citations[mid]

            elif citations[mid] < n-mid: start = mid+1

            else:

                end = mid-1

        return n-end-1
