# Time Exceed Limited

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        def manipulate(slicenums):
            total = 1
            for i in slicenums:
                total *= i
            return total
        output = [0]*len(nums)
        for i in range(len(nums)):
            output[i] = manipulate(nums[:i] + nums[i+1:])
        return output
