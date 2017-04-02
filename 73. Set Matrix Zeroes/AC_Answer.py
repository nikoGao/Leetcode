# Use O(n) space extra space and O(n) = O(mn), not very well
class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix); n = len(matrix[0])
        if matrix:
            cols = []
            for i in range(m):
                temp = []
                for j in range(n):
                    if matrix[i][j] == 0:
                        if j not in temp:
                            temp.append(j)
                if temp:
                    matrix[i] = [0]*n
                    cols += temp
            for each in set(cols):
                for i in range(m):
                    matrix[i][each] = 0
                        
