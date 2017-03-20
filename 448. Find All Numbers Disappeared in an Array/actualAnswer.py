#use positive and negative symbol to connect each element with its index
#So that the index of each existed element in [1,n] with be negative, the result is the list of all positive elements' index

class Solution(object):

    def findDisappearedNumbers(self, nums):

        """

        :type nums: List[int]

        :rtype: List[int]

        """

        for each in nums:

            nums[abs(each)-1] = -abs(nums[abs(each)-1])

        return [i+1 for i, n in enumerate(nums) if n > 0]
