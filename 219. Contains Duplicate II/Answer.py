class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        num_dict = {}
        for i in range(len(nums)):
            if nums[i] in num_dict and i - num_dict[nums[i]] <= k:
                return True
            else:
                num_dict[nums[i]] = i
        return False
