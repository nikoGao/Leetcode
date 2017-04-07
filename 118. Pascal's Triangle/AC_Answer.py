# Run time 42ms
# Elinmate (i+1)/2+1

class Solution(object):

    def generate(self, numRows):

        """

        :type numRows: int

        :rtype: List[List[int]]

        """

        if numRows == 0:

            return []

        if numRows == 1:

            return [[1]]

        if numRows == 2:

            return [[1],[1,1]]

        res = [[1],[1,1]]

        for i in range(2, numRows):

            res.append([1 for k in range(i+1)])

            for j in range(1,(i+1)/2+1):

                res[i][j] = res[i][i-j] = res[i-1][j-1] + res[i-1][j]

        return res
