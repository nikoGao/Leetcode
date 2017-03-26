class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        diff = 1000000000
        if not len(nums):
            return 0
        res = nums[0] + nums[1] + nums[2]
        nums.sort()
        for i in range(len(nums)-2):
            j = i + 1
            k = len(nums) - 1
            while j < k:
                temp = nums[i] + nums[j] + nums[k]
                if abs(temp - target) < abs(res - target):
                    res = temp
                if temp < target:
                    j += 1
                elif temp > target:
                    k -= 1
                else:
                    j += 1
                    k -= 1
        return res
            
            
