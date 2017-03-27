# Notice, each elem can be used only once, so the start need to move
class Solution(object):

    def dfs(self, candidates, target, start, valuelist):

        len1 = len(candidates)

        if target == 0 and valuelist not in Solution.res:

            Solution.res.append(valuelist)

        for i in range(start, len1):

            if target < candidates[i]:

                return

            self.dfs(candidates, target-candidates[i], i + 1, valuelist + [candidates[i]])

    

    def combinationSum2(self, candidates, target):

        """

        :type candidates: List[int]

        :type target: int

        :rtype: List[List[int]]

        """

        candidates.sort()

        Solution.res = []

        self.dfs(candidates, target, 0, [])

        return Solution.res
