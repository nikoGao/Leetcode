#26进制转十进制
class Solution(object):

    def titleToNumber(self, s):

        """

        :type s: str

        :rtype: int

        """

        strlist = list(s)

        strlist.reverse()

        num = 0

        for i in range(len(strlist)):

            num += (ord(strlist[i]) - 64) * (26 ** i)

        return num
