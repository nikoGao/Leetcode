# Use space O(n)
# Run time O(n) 62ms

class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        if not triangle:
            return 
        for row in range(1,len(triangle)):
            for col in range(len(triangle[row])):
                if col == 0:
                    triangle[row][col] += triangle[row-1][col]
                elif col == len(triangle[row]) - 1:
                    triangle[row][col] += triangle[row-1][col-1]
                else:
                    triangle[row][col] += min(triangle[row-1][col-1], triangle[row-1][col])
        return min(triangle[-1])
            
