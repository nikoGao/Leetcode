# 如果： | nums[i] - nums[j] | <= t   式a

#等价： | nums[i] / t - nums[j] / t | <= 1   式b

#推出： | floor(nums[i] / t) - floor(nums[j] / t) | <= 1   式c

#等价： floor(nums[j] / t) ∈ {floor(nums[i] / t) - 1, floor(nums[i] / t), floor(nums[i] / t) + 1} 式d

class Solution(object):

    def containsNearbyAlmostDuplicate(self, nums, k, t):

        """

        :type nums: List[int]

        :type k: int

        :type t: int

        :rtype: bool

        """

        if t < 0: return False

        n = len(nums)

        d = {}

        w = t + 1

        for i in xrange(n):

            m = nums[i] / w

            if m in d:

                return True

            if m - 1 in d and abs(nums[i] - d[m - 1]) < w:

                return True

            if m + 1 in d and abs(nums[i] - d[m + 1]) < w:

                return True

            d[m] = nums[i]

            if i >= k: del d[nums[i - k] / w]

        return False
