class Solution(object):

    def reverseString(self, s):

        """

        :type s: str

        :rtype: str

        """

        strings = list(s)

        strings.reverse()

        return ''.join(i for i in strings)
