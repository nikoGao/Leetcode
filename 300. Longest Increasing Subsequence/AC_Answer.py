# use dynamic plan: dp[x] = max(dp[x], dp[y] + 1) nums[x] > nums[y]
# Time: O(n^2)

class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        dp = [1] * length
        for x in range(length):
            for y in range(x):
                if nums[x] > nums[y]:
                    dp[x] = max(dp[x], dp[y] + 1)
        return max(dp) if dp else 0
            
