# Run time: slower

class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left, right = 0, 0
        if len(nums) == 1: return 0
        i = 0
        while i < len(nums):
            if i == 0:
                left = -10000000000000
            else:
                left = nums[i-1]
            if i == len(nums)-1:
                right = -10000000000000
            else:
                right = nums[i+1]
            if nums[i] > left and nums[i]>right:
                return i
            i += 1
