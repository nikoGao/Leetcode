# Improvement, use while to replace for, minus O(n)
class Solution(object):

    def findContentChildren(self, g, s):

        """

        :type g: List[int]

        :type s: List[int]

        :rtype: int

        """

        g.sort()

        s.sort()

        count = 0

        i, j = len(g)-1, len(s)-1

        while min(i, j) >= 0:

            if g[i] <= s[j]:

                count += 1

                j -= 1

            i -= 1

        return count

            
