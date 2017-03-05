#动态规划问题，用数学表达式抽象，找规律
#按题意：F(n) = max(F(n-1), F(n-2)+nums[n-1])
class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums:
            last, now = 0, 0
            for i in nums:
                last, now = now, max(last+i, now)
            return now
        return 0
