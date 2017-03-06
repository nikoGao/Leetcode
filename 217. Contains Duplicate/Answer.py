class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        count = {}
        if nums:
            for i in range(len(nums)):
                if str(nums[i]) not in count:
                    count[str(nums[i])] = 1
                else:
                    return True
            return False
        else:
            return False
        
