class Solution(object):

    def rotate(self, matrix):

        """

        :type matrix: List[List[int]]

        :rtype: void Do not return anything, modify matrix in-place instead.

        """

        length = len(matrix)

        for i in range(length):

            for j in range(i+1,length):

                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        for line in matrix:

            line.reverse()
