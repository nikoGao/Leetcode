# Run time 216ms
# DFS and enumerate
class Solution(object):
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
        def isPalindrome(s):
            for i in range(len(s)/2+1):
                if s[i] != s[len(s)-i-1]: return False
            return True
            
        def dfs(s, stringList):
            if len(s) == 0:res.append(stringList)
            for i in range(1, len(s)+1):
                if isPalindrome(s[:i]):
                    dfs(s[i:], stringList+ [s[:i]])
        res = []
        dfs(s, [])
        return res
