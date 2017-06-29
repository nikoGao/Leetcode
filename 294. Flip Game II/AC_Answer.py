#recursive and backtracking
# without memorization
# time 3150ms
class Solution(object):
    def canWin(self, s):
        return any(s[i:i+2]=='++' and not self.canWin(s[:i]+'--'+s[i+2:])
                for i in range(len(s)))
