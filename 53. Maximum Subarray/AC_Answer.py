# Same thinking: select cur = max(nums[i], sum+nums[i]); select max(Maxsum, cur)

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        cur = maxSum = nums[0]
        for num in nums[1:]:
            cur = max(num, cur+num)
            maxSum = max(cur, maxSum);
        return maxSum
