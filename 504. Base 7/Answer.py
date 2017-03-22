class Solution(object):

    def convertToBase7(self, num):

        """

        :type num: int

        :rtype: str

        """

        result = []

        acnum = abs(num)

        if num == 0:

            return '0'

        while acnum:

            acnum, rest = divmod(acnum, 7)

            result.insert(0, str(rest))

        if num < 0:

            result.insert(0, '-')

        return ''.join(i for i in result)
