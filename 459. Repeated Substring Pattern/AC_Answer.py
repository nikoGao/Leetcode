#If the string is made up of its substring, then the string_length is multiple of sub_legth. So find the all multiple length substring and verify
class Solution(object):

    def repeatedSubstringPattern(self, s):

        """

        :type s: str

        :rtype: bool

        """

        size = len(s)

        for x in range(1, size / 2 + 1):

            if size % x:

                continue

            if s[:x] * (size / x) == s:

                return True

        return False
