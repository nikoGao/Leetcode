class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        search = {}
        for i in nums:
            if i not in search:
                search[i] = 1
            else:
                search[i] = 2
        for i in search:
            if search[i] == 1:
                return i
