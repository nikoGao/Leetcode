# First consideration, use dict to track the distance varieties.
# Second consideration, use the permutations A(n, 2) = n * (n-1)
import collections

class Solution(object):

    def numberOfBoomerangs(self, points):

        """

        :type points: List[List[int]]

        :rtype: int

        """

        ans = 0

        for x1, y1 in points:

            dict1 = collections.defaultdict(int)

            for x2, y2 in points:

                dict1[(x1-x2)**2 + (y1-y2)**2] += 1

            for each in dict1:

                ans += dict1[each] * (dict1[each]-1)

        return ans
