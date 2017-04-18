# Almost same thinking, but a nice writing
# Use a boolean ,if len(nums) == 0 then return False which equal to 0

class Solution:
    def rob(self, nums):
        def rob(nums):
            now = prev = 0
            for n in nums:
                now, prev = max(now, prev+n), now
            return now
        return max(rob(nums[len(nums) != 1:]), rob(nums[:-1]))
