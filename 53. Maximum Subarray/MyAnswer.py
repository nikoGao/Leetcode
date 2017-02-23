#Limit time override
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        else:
            max = nums[0]
            for length in range(1, len(nums)+1):
                temp = self.compareSublist(nums, length)
                if max<temp:
                    max = temp
            return max
            
    def compareSublist(self, nums, length):
        result = [sublist for sublist in 
                (nums[x:x+length] for x in range(len(nums)-length+1))]
        sums = [sum(x) for x in result]
        sums.sort()
        return sums[-1]
