# Run time 39ms
class Solution(object):

    def reverseWords(self, s):

        """

        :type s: str

        :rtype: str

        """

        strings = s.split(' ')

        strings.reverse()

        res = ''

        for string in strings:

            if string == '':

                continue

            res += string + ' '

        return res.rstrip(' ')
