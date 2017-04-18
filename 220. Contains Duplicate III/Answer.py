# Time Limited Exceed O(n^2)

class Solution(object):

    def containsNearbyAlmostDuplicate(self, nums, k, t):

        """

        :type nums: List[int]

        :type k: int

        :type t: int

        :rtype: bool

        """

        if nums == []: return False

        for i in range(len(nums)):

            tmp = 1

            while tmp <= k:

                j = i + tmp

                if j < len(nums) and abs(nums[i]-nums[j]) <= t:

                    return True

                tmp += 1

        return False
