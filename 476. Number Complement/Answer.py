class Solution(object):

    def findComplement(self, num):

        """

        :type num: int

        :rtype: int

        """

        str_num = bin(num).split('b')[-1]

        result = []

        for each in str_num:

            if each == '1':

                result.append('0')

            else:

                result.append('1')

        result_num = ''.join(each for each in result)

        return int(result_num, 2)
