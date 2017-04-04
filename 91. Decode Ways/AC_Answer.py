# Use recursion: there are three circumstances:
# First, if s[i-2:i] is a num between 10 to 26, then dp[i] = dp[i-1] + dp[i-2]
# Second, if s[i-2:i] is 10 or 20, there is only one way to decode, so dp[i] = dp[i-2]
# Third, if s[i-2:i] is num like '09', there is 0 way to decode, and if it is a num >26, like 31, then there is only one way to decode dp[i] = dp[i-1]
# Key: the first two dp is both 1.
# Run time 62ms

class Solution(object):
    def numDecodings(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == '' or s[0] == '0':return 0
        dp = [1,1]
        for i in range(2, len(s)+1):
            if 10 <= int(s[i-2:i]) <= 26 and s[i-1] != '0':
                dp.append(dp[i-1] + dp[i-2])
            elif int(s[i-2:i]) == 10 or int(s[i-2:i]) == 20:
                dp.append(dp[i-2])
            elif s[i-1] != '0':
                dp.append(dp[i-1])
            else:
                return 0
        return dp[-1]
