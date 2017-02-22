#和26思路相同
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        if not nums:
            return 0
        else:
            j = 0
            for i in range(0,len(nums)):
                if nums[i] != val:
                    nums[j], nums[i] = nums[i], nums[j]
                    j = j + 1
            return j
