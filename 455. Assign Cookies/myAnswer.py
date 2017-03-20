# Time limited Exceed
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

        for i in range(len(g)):

            for j in range(len(s)):

                if s[j] >= g[i]:

                    count += 1

                    s[j] = -1

                    break

        return count

            
