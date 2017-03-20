# Time Limited Exceeding
class Solution(object):

    def findDisappearedNumbers(self, nums):

        """

        :type nums: List[int]

        :rtype: List[int]

        """

        result = []

        for each in range(1, len(nums)+1):

            if each not in nums:

                result.append(each)

        return result
