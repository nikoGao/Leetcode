# Add a condition to check duplicate lists

class Solution(object):

    def permuteUnique(self, nums):

        """

        :type nums: List[int]

        :rtype: List[List[int]]

        """

        perms = [[]]

        for n in nums:

            new_perm = []

            for perm in perms:

                for i in xrange(len(perm) + 1):

                    addon = perm[:i] + [n] + perm[i:]

                    if addon not in new_perm:

                        new_perm.append(addon)

            perms = new_perm

        return perms
