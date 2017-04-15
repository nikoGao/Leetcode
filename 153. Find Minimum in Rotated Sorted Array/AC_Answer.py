# Run time 46ms

class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        mini, i = nums[0], 1
        end = True
        while end and i < len(nums):
            if nums[i]< mini:
                end = False
                mini = nums[i]
            i += 1
        return mini
