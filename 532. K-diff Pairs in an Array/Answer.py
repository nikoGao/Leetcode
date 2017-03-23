class Solution(object):

    def findPairs(self, nums, k):

        """

        :type nums: List[int]

        :type k: int

        :rtype: int

        """

        result = []

        if k >= 0:

            for i in range(len(nums)-1):

                if nums[i]-k in nums[i+1:]:

                    if (nums[i], nums[i]-k) not in result and (nums[i]-k, nums[i]) not in result:

                        result.append((nums[i], nums[i]-k))

                if nums[i]+k in nums[i+1:]:

                    if (nums[i], nums[i]+k) not in result and (nums[i]+k, nums[i]) not in result:

                        result.append((nums[i], nums[i]+k))

        return len(result)
