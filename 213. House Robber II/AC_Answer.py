# Just notice, in a circle, if rob the first house, then can't rob the last, but if rob the last, then no first

class Solution(object):

    def rob(self, nums):

        """

        :type nums: List[int]

        :rtype: int

        """

        def robbery(nums):

            size = len(nums)

            odd, even = 0, 0

            for i in range(size):

                if i % 2 != 0:

                    odd = max(odd+nums[i], even)

                else:

                    even = max(even+nums[i], odd)

            return max(odd, even)

            

        if len(nums) == 1:

            return nums[0]

        return max(robbery(nums[1:]), robbery(nums[:-1]))

        

        
