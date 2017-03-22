# If there is grid on top of, perimeter - 2. If there is one on the left, perimeter - 2.

class Solution(object):

    def islandPerimeter(self, grid):

        """

        :type grid: List[List[int]]

        :rtype: int

        """

        l = len(grid)

        w = len(grid[0]) if l else 0

        ans = 0

        for i in range(l):

            for j in range(w):

                if grid[i][j] == 1:

                    ans += 4

                    if i > 0 and grid[i-1][j]:

                        ans -= 2

                    if j > 0 and grid[i][j-1]:

                        ans -= 2

        return ans
