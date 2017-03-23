#Time limited Exceed
class Solution(object):

    def findPairs(self, nums, k):

        """

        :type nums: List[int]

        :type k: int

        :rtype: int

        """

        result = []

        for i in range(len(nums)-1):

            for j in nums[i+1:]:

                if abs(nums[i]- j) == k and (nums[i], j) not in result and (j, nums[i]) not in result:

                    result.append((nums[i], j))

        return len(result)
