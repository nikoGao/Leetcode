import math

class Solution(object):

    def constructRectangle(self, area):

        """

        :type area: int

        :rtype: List[int]

        """

        mid = int(math.sqrt(area))

        l, w = 0, 0

        for i in range(mid, 0, -1):

            if area % i == 0:

                l, w = area/i, i

                break

        return [l, w]
