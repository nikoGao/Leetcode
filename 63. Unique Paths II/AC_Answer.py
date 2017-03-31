# Connected with 62, only need to judge whether it is block, if is, then current path is 0, nothing to add.

class Solution(object):

    def uniquePathsWithObstacles(self, obstacleGrid):

        """

        :type obstacleGrid: List[List[int]]

        :rtype: int

        """

        m = len(obstacleGrid)

        n = len(obstacleGrid[0])

        paths = [[0 for i in range(n)] for j in range(m)]

        for i in range(m):

            if obstacleGrid[i][0] == 0:

                paths[i][0] = 1

            else:

                paths[i][0] = 0

                break

        for j in range(n):

            if obstacleGrid[0][j] == 0:

                paths[0][j] = 1

            else:

                paths[0][j] = 0

                break

        for i in range(1,m):

            for j in range(1,n):

                if obstacleGrid[i][j] == 1:

                    paths[i][j] = 0

                else:

                    paths[i][j] = paths[i-1][j] + paths[i][j-1]

        return paths[m-1][n-1]
