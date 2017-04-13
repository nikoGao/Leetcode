# Time Exceed Limited
class Solution(object):

    def maxProduct(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        if len(nums) == 1:

            return nums[0]

        production = []

        for i in range(len(nums)):

            tmp = [nums[i]]

            for j in range(i+1, len(nums)):

                tmp.append(tmp[-1]*nums[j])

            production.append(max(tmp))

        return max(production)

        

        
