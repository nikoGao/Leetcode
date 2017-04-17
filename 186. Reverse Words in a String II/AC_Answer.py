#Hints:
#Two-pass:
#1. reverse all strings:
#"the sky is blue" -> "eulb si yks eht"

#2. reverse one word:
#"eulb si yks eht" -> "blue is sky the"

class Solution(object):
    def reverseWords(self, s):
    """
    :type a: a list of i length strings(List[str])
    :rtype: nothing
    """
    def reverse(s, begin, end):
        for i in range((end-begin)/2):
            s[begin+i], s[end-i] = s[end-i], s[begin+i]
    reverse(s, 0, len(s))
    i = 0
    for j in xrange(len(s)+1):
        if j == len(s) or s[j] == '':
            reverse(s, i, j)
            i = j + 1
