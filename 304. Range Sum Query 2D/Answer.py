# Time Limit Excee

class NumMatrix(object):

    def __init__(self, matrix):
        """
        :type matrix: List[List[int]]
        """
        self.matrix = matrix
        self.rows = len(self.matrix)
        if self.rows:
            self.cols = len(self.matrix[0])
        else:
            self.cols = 0
        

    def sumRegion(self, row1, col1, row2, col2):
        """
        :type row1: int
        :type col1: int
        :type row2: int
        :type col2: int
        :rtype: int
        """
        res = 0
        if row1 < self.rows and col1 < self.cols:
            for i in range(row1, row2+1):
                for j in range(col1, col2+1):
                    res += self.matrix[i][j]
        return res
        


# Your NumMatrix object will be instantiated and called as such:
# obj = NumMatrix(matrix)
# param_1 = obj.sumRegion(row1,col1,row2,col2)
