#Time is 66ms

class Solution(object):

    def lengthOfLastWord(self, s):

        """

        :type s: str

        :rtype: int

        """

        words = re.findall('(\w+)', s)

        if words:

            return len(words[-1])

        return 0
