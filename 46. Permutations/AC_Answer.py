# Thought: we can add the nth number into the resulting List<List<Integer>> from the n-1 numbers, in every possible position
# So first loop is elem in nums, second loop is current lists in perm, finial loop is possible position.

class Solution(object):

    def permute(self, nums):

        """

        :type nums: List[int]

        :rtype: List[List[int]]

        """

        perms = [[]]   

        for i in nums:

            new_perm = []

            for perm in perms:

                for n in xrange(len(perm)+1):

                    new_perm.append(perm[:n] + [i] + perm[n:])

            perms = new_perm

        return perms
