#首先将nums中的数字放入字典c

#遍历set(nums)，记当前数字为n

#若n + k在c中，则将结果+1
class Solution(object):

    def findPairs(self, nums, k):

        """

        :type nums: List[int]

        :type k: int

        :rtype: int

        """

        if k < 0: return 0

        c = collections.Counter(nums)

        return sum(c[n + k] > 1 - bool(k) for n in c.keys())
