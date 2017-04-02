# Use O(1) space, but O(n) time
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        count = collections.Counter(nums)
        n = 0
        for each in count:
            for j in range(count[each]):
                nums[n] = each
                n += 1
