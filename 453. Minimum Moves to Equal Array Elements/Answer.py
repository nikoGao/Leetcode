# According to the question, it is equal to minus each number in the list until it is equal to the minimum num.
# So the answer is the plus of difference between each elem and min.

class Solution(object):

    def minMoves(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        return sum(nums) - min(nums) * len(nums)
