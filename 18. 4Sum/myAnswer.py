# Use threeSum, but time limited exceeding
class Solution(object):
    def threeSum(self, nums, target, curr):
        res = []
        for i in range(len(nums)-2):
            if i == 0 or nums[i] > nums[i-1]:
                j = i + 1
                k = len(nums) - 1
                while j < k:
                    if nums[j] + nums[k] == target - nums[i]:
                        res.append([curr, nums[i], nums[j], nums[k]])
                        j += 1
                        k -= 1
                        while j < k and nums[j] == nums[j-1]: j +=1
                        while j < k and nums[k] == nums[k+1]: k -= 1
                    elif nums[j] + nums[k] < target - nums[i]:
                        while j < k:
                                j += 1
                                if nums[j] > nums[j-1]: break
                    else:
                        while j < k:
                                k -= 1
                                if nums[k] < nums[k+1]: break
        return res
                
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        for i in range(len(nums)-3):
            if i == 0 or nums[i] > nums[i-1]:
                res += self.threeSum(nums[i+1:], target-nums[i], nums[i])
        return res
        
