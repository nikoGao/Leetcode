class Solution(object):

    def longestPalindrome(self, s):

        """

        :type s: str

        :rtype: int

        """

        strdict = {}

        for each in s:

            if each not in strdict:

                strdict[each] = 1

            else:

                strdict[each] += 1

        longest, odd = 0, 0

        for every in strdict.keys():

            if strdict[every] % 2 == 0:

                longest += strdict[every]

            if strdict[every] % 2 == 1:

                longest += (strdict[every] - 1)

                odd = 1

        return longest + odd
