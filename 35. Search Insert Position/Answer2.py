# Submission Time(43ms)

class Solution(object):

    def searchInsert(self, nums, target):

        """

        :type nums: List[int]

        :type target: int

        :rtype: int

        """

        if nums:

            i = 0

            while i < len(nums) and nums[i]< target:

                i += 1

            if i== len(nums) or nums[i] >= target:

                return i

        return 0
