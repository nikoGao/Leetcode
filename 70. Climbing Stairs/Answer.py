#动态规划问题
#假设要到达第n层台阶，即有两种方案，一、在n-2上再跨两步；二、在n-1上再跨一步
#因此抽象成表达式为f(n)=f(n-2)+f(n-1)，则总方法为f(n)
class Solution(object):
     def climbStairs(self, n):
     """
     :type n: int
     :rtype: int
     """
     dp = [1 for i in range(n+1)]
     for i in range(2,n+1):
	 dp[i] = dp[i-2] + dp[i-1]
     return dp[n]
