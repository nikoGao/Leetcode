#杨辉三角：第n行第k個數字等於第n-1行的第k-1個數字與第k個數字的和
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
            return [[1], [1, 1]]
        if numRows > 2:
            relist = [[] for i in range(numRows)]
            for i in range(0, numRows):
                relist[i] = [1 for j in range(i + 1)]
            for row in range(2, numRows):
                for elem in range(1, row):
                    relist[row][elem] = relist[row-1][elem-1] + relist[row-1][elem]
        return relist
