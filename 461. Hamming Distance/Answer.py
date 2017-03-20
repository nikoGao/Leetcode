class Solution(object):

    def hammingDistance(self, x, y):

        """

        :type x: int

        :type y: int

        :rtype: int

        """

        result = x ^ y

        count = 0

        for i in bin(result).split('b')[-1]:

            if i == '1':

                count += 1

        return count
