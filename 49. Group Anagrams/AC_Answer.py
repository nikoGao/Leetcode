# Actually, the most thought is similar, but in this solution, use sorted instead of collection.Counter, just sort the string and label it.

class Solution(object):

    def groupAnagrams(self, strs):

        """

        :type strs: List[str]

        :rtype: List[List[str]]

        """

        d = {}

        ans = []

        k = 0

        for str in strs:

            sstr = ''.join(sorted(str))

            if sstr not in d:

                d[sstr] = k

                k = k+1

                ans.append([])

                ans[-1].append(str)

            else:

                ans[d[sstr]].append(str)

        return ans
