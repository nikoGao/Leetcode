# O(n) time but use extra space
class Solution(object):

    def singleNumber(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        dict1 = collections.Counter(nums)

        for key, value in dict1.iteritems():

            if value == 1:

                return key

        
