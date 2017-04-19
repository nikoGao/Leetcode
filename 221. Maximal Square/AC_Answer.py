# We initialize another matrix (dp) with the same dimensions as the original one initialized with all 0’s.
#dp(i,j) represents the side length of the maximum square whose bottom right corner is the cell with index (i,j) in the original matrix.
#Starting from index (0,0), for every 1 found in the original matrix, we update the value of the current element as
# dp(i, j) = min(dp(i-1, j), dp(i-1, j-1), dp(i, j-1)) + 1
#We also remember the size of the largest square found so far. In this way, we traverse the original matrix once and find out the required maximum size. This gives the side length of the square (say maxsqlenmaxsqlen). The required result is the area maxsqlen^2maxsqlen.

class Solution(object):

    def maximalSquare(self, matrix):

        """

        :type matrix: List[List[str]]

        :rtype: int

        """

        if matrix == []:return 0

        m, n = len(matrix), len(matrix[0])

        dp = [[0]*n for i in range(m)]

        ans = 0

        for x in range(m):

            for y in range(n):

                dp[x][y] = int(matrix[x][y])

                if x and y and dp[x][y]:

                    dp[x][y] = min(dp[x-1][y], min(dp[x][y-1], dp[x-1][y-1])) + 1

                ans = max(ans, dp[x][y])

        return ans**2
