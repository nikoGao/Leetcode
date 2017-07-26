# First, caculate sum of 0,0 to x,y -> sums[x][y]
# Then 容斥原理: return self.sums[row2 + 1][col2 + 1] + self.sums[row1][col1] - self.sums[row1][col2 + 1] - self.sums[row2 + 1][col1]

class NumMatrix(object):

    def __init__(self, matrix):
        """
        :type matrix: List[List[int]]
        """
        m = len(matrix)
        n = len(matrix[0]) if m else 0
        self.sums = [[0] * (n + 1) for x in range(m + 1)]
        for x in range(1, m + 1):
            rowSum = 0
            for y in range(1, n + 1):
                self.sums[x][y] += rowSum + matrix[x - 1][y - 1]
                if x > 1:
                    self.sums[x][y] += self.sums[x - 1][y]
                rowSum += matrix[x - 1][y - 1]

        

    def sumRegion(self, row1, col1, row2, col2):
        """
        :type row1: int
        :type col1: int
        :type row2: int
        :type col2: int
        :rtype: int
        """
        return self.sums[row2 + 1][col2 + 1] + self.sums[row1][col1] \
                 - self.sums[row1][col2 + 1] - self.sums[row2 + 1][col1]
        


# Your NumMatrix object will be instantiated and called as such:
# obj = NumMatrix(matrix)
# param_1 = obj.sumRegion(row1,col1,row2,col2)
