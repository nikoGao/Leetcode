class Solution(object):

    def firstUniqChar(self, s):

        """

        :type s: str

        :rtype: int

        """

        if s:

            chardict = {}

            for i in range(len(s)):

                if s[i] not in chardict:

                    chardict[s[i]] = 1

                else:

                    chardict[s[i]] += 1

            minindex = len(s) + 1

            for each in chardict.keys():

                if chardict[each] == 1:

                    minindex = min(minindex, list(s).index(each))

            if minindex != len(s) + 1:

                return minindex

        return -1
