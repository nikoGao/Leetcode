# Run time O(n)
# Space O(n)

class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = collections.Counter(nums)
        for item, value in dic.items():
            if value > 1:
                return item
            else:
                continue
        else:
            return False
