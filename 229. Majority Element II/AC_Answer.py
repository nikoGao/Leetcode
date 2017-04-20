# Not use linear time and use more than O(1) space

class Solution(object):

    def majorityElement(self, nums):

        """

        :type nums: List[int]

        :rtype: List[int]

        """

        times = len(nums)/3

        nums_map = collections.Counter(nums)

        ans = []

        for key, value in nums_map.items():

            if value > times:

                ans.append(key)

        return ans
