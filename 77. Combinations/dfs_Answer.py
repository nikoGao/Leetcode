# Time Limited Exceed
class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        def dfs(start, valuelist):
            if self.count == k: ret.append(valuelist); return
            for i in range(start, n + 1):
                self.count += 1
                dfs(i + 1, valuelist + [i])
                self.count -= 1
        ret = []; self.count = 0
        dfs(1, [])
        return ret
            
