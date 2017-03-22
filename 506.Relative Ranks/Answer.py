class Solution(object):

    def findRelativeRanks(self, nums):

        """

        :type nums: List[int]

        :rtype: List[str]

        """

        result = [0] * len(nums)

        origin = [i for i in nums]

        nums.sort(reverse=True)

        for i in range(len(nums)):

            index = origin.index(nums[i])

            if i == 0:

                result[index] = "Gold Medal"

            elif i == 1:

                result[index] = "Silver Medal"

            elif i == 2:

                result[index] = "Bronze Medal"

            else:

                result[index] = str(i+1)

        return result

                

        
