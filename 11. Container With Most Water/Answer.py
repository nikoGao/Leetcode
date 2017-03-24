# use two points, keep (n-i) to be the most, then find two largest height
class Solution(object):

    def maxArea(self, height):

        """

        :type height: List[int]

        :rtype: int

        """

        area = 0

        l, r = 0, len(height) -1

        while l < r:

            temp = min(height[l], height[r]) * (r-l)

            if temp > area: area = temp

            if height[l] < height[r]:

                l += 1

            else:

                r -= 1

        return area
