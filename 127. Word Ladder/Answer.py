# Time Limited Exceed
#解题思路：这道题使用bfs来解决。参考：http://chaoren.is-programmer.com/posts/43039.html 使用BFS, 单词和length一块记录, dict中每个单词只能用一次, 所以用过即删。dict给的是set类型, 检查一个单词在不在其中(word in dict)为O(1)时间。设单词长度为L, dict里有N个单词, 每次扫一遍dict判断每个单词是否与当前单词只差一个字母的时间复杂度是O(N*L), 而每次变换当前单词的一个字母, 看变换出的词是否在dict中的时间复杂度是O(26*L), 所以要选择后者。

class Solution(object):
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        # wordList.append(endWord)
        queue = []
        queue.append((beginWord, 1))
        while queue:
            curr = queue.pop(0)
            currWord = curr[0]; step = curr[1]
            if currWord == endWord: return step
            for i in range(len(beginWord)):
                wordpart1 = currWord[:i]; wordpart2 = currWord[i+1:]
                for j in 'abcdefghijklmnopqrstuvwxyz':
                    if j != currWord[i]:
                        nextWord = wordpart1 + j + wordpart2
                        if nextWord in wordList:
                            queue.append((nextWord, step+1))
                            wordList.pop(wordList.index(nextWord))
        return 0
        
