class Solution(object):

    def generateMatrix(self, n):

        """

        :type n: int

        :rtype: List[List[int]]

        """

        res = [[0]*n for i in range(n)]

        if n:

            up = 0; left = 0

            down = n-1; right = n-1

            direct = 0

            i = 1

            while i < n**2 + 1:

                if direct == 0:

                    for j in range(left, right+1):

                        res[up][j] = i

                        i += 1

                    up += 1

                if direct == 1:

                    for j in range(up, down+1):

                        res[j][right] = i

                        i += 1

                    right -= 1

                if direct == 2:

                    for j in range(right, left-1, -1):

                        res[down][j] = i

                        i += 1

                    down -= 1

                if direct == 3:

                    for j in range(down, up-1, -1):

                        res[j][left] = i

                        i += 1

                    left += 1

                direct = (direct+1) % 4

        return res
