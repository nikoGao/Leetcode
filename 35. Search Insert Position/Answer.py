class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target in nums:
            index = nums.index(target)
        else:
            nums.append(target)
            nums.sorted()
            index = nums.index(target)
        return index
