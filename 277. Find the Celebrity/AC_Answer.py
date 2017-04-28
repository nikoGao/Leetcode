# Brute-Force

class Solution:
    def findCelebrity(self, n):
        for i in range(n):
            for j in range(n):
                if i == j:
                    continue
                if [knows(i, j), knows(j, i)] != [False, True]:
                    break
            else:
                return i
        return -1
