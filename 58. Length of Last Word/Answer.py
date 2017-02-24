class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = 0
        if s:
            words = s.split(' ')
            i = -1
            while i>= -len(words):
                if words[i] != '':
                    length = len(words[i])
                    break
                i -= 1
        return length 
