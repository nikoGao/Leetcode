# space O(1), time O(n)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        if matrix != [[]] and matrix != []:
            i = 0
            row = 0
            while i < m:
                if target >= matrix[i][0] and target <= matrix[i][-1]:
                    row = i
                    break
                i += 1
            if target in matrix[row]:
                return True
        return False
