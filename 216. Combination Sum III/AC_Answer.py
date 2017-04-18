# Time O(n)

class Solution(object):

    def combinationSum3(self, k, n):

        """

        :type k: int

        :type n: int

        :rtype: List[List[int]]

        """

        def findcombination(k, n, nums, res):

            if k == 0 and n != 0:

                return

            elif k == 0 and n == 0:

                ans.append(res)

            else:

                for i in range(len(nums)):

                    findcombination(k-1, n-nums[i], nums[i+1:], res+[nums[i]])

                

        ans = []

        nums = [i+1 for i in range(9)]

        findcombination(k, n, nums, [])

        return ans
