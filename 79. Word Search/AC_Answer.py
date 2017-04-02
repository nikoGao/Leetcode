# Time 135ms(99.13%) 
#采用深度优先遍历的方法，以每一个元素为起点进行查找。在此之前，可以做一个简单的前置判断，如果目标字符串中的某一个字母的数目比矩阵中所有该字母的数目还多，那么肯定是找不到目标字符串的。在进行深度遍历的时候，如果所有当前的遍历的位置越界或者与预期的值不等则返回，如果值相等，那么暂时把当前的值用特殊字符代替，防止继续遍历的时候又访问到访问过的点

class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        if self._hasEnoughWord(board, word):
            m = len(board)
            n = len(board[0])
            for i in range(m):
                for j in range(n):
                    if self._existWord(board, i, j, m, n, word):
                        return True
            return False
        else:
            return False
        
    def _existWord(self, board, i, j, m, n, word):
        if len(word) == 0:
            return True
        if i<0 or i>=m or j<0 or j>=n or board[i][j] != word[0]:
            return False
        temp = board[i][j]
        board[i][j] = '*'
        next_target = word[1:]
        next_result = self._existWord(board, i+1, j, m, n, next_target) or self._existWord(board, i-1, j, m, n, next_target) or self._existWord(board, i, j+1, m, n, next_target) or self._existWord(board, i, j-1, m, n, next_target)
        board[i][j] = temp
        return next_result
        
    def _hasEnoughWord(self, board, word):
        character_counts = collections.defaultdict(int)
        for ch in word:
            character_counts[ch] += 1
        return all(sum(map(lambda line: line.count(ch), board)) >= count for ch, count in character_counts.items())
