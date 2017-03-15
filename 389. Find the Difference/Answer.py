class Solution(object):

    def findTheDifference(self, s, t):

        """

        :type s: str

        :type t: str

        :rtype: str

        """

        list1 = list(t)

        for i in range(len(s)):

            if s[i] in t:

                list1.pop(list1.index(s[i]))

        return list1[0]

        
