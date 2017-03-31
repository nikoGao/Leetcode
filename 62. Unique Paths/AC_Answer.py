# Same Quesiton as Climbing Stairs, dp[i][j] = dp[i-1][j] + dp[i][j-1]
# Not quite familiar with the detail

class Solution(object):

    def uniquePaths(self, m, n):

        """

        :type m: int

        :type n: int

        :rtype: int

        """

        direction = 0

        path = []

        if m == 1 and n == 1:

            path = [[1]]

        elif m == 1 and n>1:

            path = [[1 for i in range(n)]]

        elif n == 1 and m >1:

            path = [[1] for i in range(m)]

        else:

            path = [[0 for j in range(n)] for i in range(m)]

            for i in range(n):

                path[0][i] = 1

            for i in range(m):

                path[i][0] = 1

            for i in range(1, m):

                for j in range(1, n):

                    path[i][j] = path[i-1][j] + path[i][j-1]

        return path[m-1][n-1]
