class Solution:
    def __init__(self, words):
        self.dic = collections.defaultdict(list)
        for i, v in enumerate(words):
            self.dic[v].append(i)

    def shortest(self, word1, word2):
        l1 = self.dic[word1]
        l2 = self.dic[word2]
        dis = 2174783647
        for i in l1:
            for j in l2:
                dis = min(dis, abs(i-j))

        return ans
