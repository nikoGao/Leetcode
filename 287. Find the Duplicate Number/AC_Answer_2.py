# Use O(1) space, O(n) time, quicker than previous answer

class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        count, temp = 1, nums[0]
        for i in range(1, len(nums)):
            if nums[i] == temp:
                count += 1
            else:
                temp = nums[i]
                count = 1
            if count > 1:
                return temp
