#三种情况：1）nums[0] != 0 2) nums[-1] != len(nums) 3)中间缺数字，递归查找
class Solution(object):

    def missingNumber(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        nums.sort()

        if nums[0] != 0:

            return 0

        if nums[-1] != len(nums):

            return len(nums)

        for i in range(1, len(nums)):

            if nums[i] - nums[i-1] != 1:

                return nums[i] - 1
