# Iteration, verify the difference == 1

class Solution(object):

    def summaryRanges(self, nums):

        """

        :type nums: List[int]

        :rtype: List[str]

        """

        res = []

        x = 0

        while x < len(nums):

            c, r = x, str(nums[x])

            while x+1 < len(nums) and nums[x+1]-nums[x] == 1:

                x += 1

            if c < x:

                r += '->' + str(nums[x])

            res.append(r)

            x += 1

        return res
