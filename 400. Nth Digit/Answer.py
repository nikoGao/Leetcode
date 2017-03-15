class Solution(object):

    def findNthDigit(self, n):

        """

        :type n: int

        :rtype: int

        """

        d, layer = 0, 0

        for i in range(1, 10):

            d += i * (9*(10 ** (i-1)))

            if n <= d:

                layer = i

                d = d - i * (9*(10 ** (i-1))) + 1

                break

        num, bit = divmod((n-d), layer)

        return int(list(str(10**(layer-1)+num))[bit])
