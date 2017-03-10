#将输入的数重复除2，3，5，判断最后是否为1
class Solution(object):

    def isUgly(self, num):

        """

        :type num: int

        :rtype: bool

        """

        if num <= 0: return False

        for i in [2,3,5]:

            while num % i == 0:

                num /= i

        return num == 1
