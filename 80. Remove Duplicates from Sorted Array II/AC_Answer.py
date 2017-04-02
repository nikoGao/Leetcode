# Time O(n) , space O(n)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map_dict = {}
        m = len(nums)
        for i in range(len(nums)):
            if nums[i] not in map_dict:
                map_dict[nums[i]] = 1
            elif map_dict[nums[i]] < 2:
                map_dict[nums[i]] += 1
            else:
                m -= 1
                nums[i] = '*'
        poped = len(nums)-m
        j = 0
        while poped > 0:
            if nums[j] == '*':
                nums.pop(j)
                poped -= 1
                j -= 1
            j += 1
        return m
