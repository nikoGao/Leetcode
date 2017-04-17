# Time Limit Exceeded

class Solution(object):

    def findRepeatedDnaSequences(self, s):

        """

        :type s: str

        :rtype: List[str]

        """

        res = []

        for i in range(len(s)-10):

            substring = s[i:i+10]

            if s[i+1:].find(substring) != -1 and s[i:i+10] not in res:

                res.append(s[i:i+10])

        return res
