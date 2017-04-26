# Use O(n) time but O(n) space

class Solution(object):

    def singleNumber(self, nums):

        """

        :type nums: List[int]

        :rtype: List[int]

        """

        dic = collections.Counter(nums)

        count = []

        for num, time in dic.items():

            if time == 1:

                count += [num]

        return count
