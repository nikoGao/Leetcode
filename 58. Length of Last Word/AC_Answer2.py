# Loop, just reverse list first, 39ms
class Solution(object):

    def lengthOfLastWord(self, s):

        """

        :type s: str

        :rtype: int

        """

        length = 0

        if s:

            words = s.split(' ')

            for each in words[::-1]:

                if each != '':

                    length = len(each)

                    break

        return length
