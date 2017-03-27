# There is four ways with using only 7 lines
# The though is right, to find duplicated elems in each line, each row and each box.

#Solution 1:
class Solution(object):

    def isValidSudoku(self, board):

        """

        :type board: List[List[str]]

        :rtype: bool

        """

        seen = sum(([(c, i), (j, c), (i/3, j/3, c)]

                for i, row in enumerate(board)

                for j, c in enumerate(row)

                if c != '.'), [])

        return len(seen) == len(set(seen))

#Solution 2:
def isValidSudoku(self, board):
    return 1 == max(collections.Counter(
        x
        for i, row in enumerate(board)
        for j, c in enumerate(row)
        if c != '.'
        for x in ((c, i), (j, c), (i/3, j/3, c))
    ).values() + [1])


#Solution 3:
seen = set()
    return not any(x in seen or seen.add(x)
                   for i, row in enumerate(board)
                   for j, c in enumerate(row)
                   if c != '.'
                   for x in ((c, i), (j, c), (i/3, j/3, c)))

#Solution 4:
seen = sum(([(c, i), (j, c), (i/3, j/3, c)]
                for i in range(9) for j in range(9)
                for c in [board[i][j]] if c != '.'), [])
    return len(seen) == len(set(seen))
