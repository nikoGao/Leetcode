class Solution(object):

    def findMaxConsecutiveOnes(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        max_length, temp = 0, 0

        for i in range(len(nums)):

            if not nums[i]:

                max_length = max(max_length, temp)

                temp = 0

            else:

                temp += 1

        if temp:

            max_length = max(max_length, temp)

        return max_length

                
