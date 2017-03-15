#Of course, Python doesn't use 8-bit numbers. It USED to use however many bits were native to your machine, but since that was non-portable, it has recently switched to using an INFINITE number of bits. Thus the number -5 is treated by bitwise operators as if it were written "...1111111111111111111011". 
#int的0和正整数范围为0~0x7FFFFFFF，int负数的范围为-0x80000000~-1,因此，大于0x7FFFFFFF的其实是最高位为1（这是符号位）。这样算出来是把最高位不当成符号位，我们还需要对负数的情况进行修正。
#在具体实现上，我们可以先 &0x7FFFFFFF 然后取反，这样，-1变为-0x80000000(-2147483648) -2变为了-0x7FFFFFFF(-2147483647) ,因此，在^0x7FFFFFFF即可
class Solution(object):

    def getSum(self, a, b):

        """

        :type a: int

        :type b: int

        :rtype: int

        """

        MAX_INT = 0x7FFFFFFF

        MASK = 0x100000000

        while b:

            a, b = (a ^ b) % MASK, ((a & b) << 1) % MASK

        return a if a <= MAX_INT else ~((a & MAX_INT) ^ MAX_INT)
