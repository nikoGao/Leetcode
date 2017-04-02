# Basing on 77, add all subsets of given k
# Time 55ms
class Solution(object):
    def combinations(self, nums, k):
        if k == 1:
            return [[i] for i in nums]
        result = []
        if len(nums) > k:
            result = [r + [nums[0]] for r in self.combinations(nums[1:], k - 1)] + self.combinations(nums[1:], k)
        else:
            result = [r + [nums[0]] for r in self.combinations(nums[1:], k - 1)]
        return result
        
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = [[]]
        n = len(nums)
        if n > 0:
            for i in range(n, 0, -1):
                tmp = self.combinations(nums, i)
                res += tmp
        return res
            
