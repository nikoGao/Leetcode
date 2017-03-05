#第一个if应该可以去除
class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        if n == 0:
            return 0
        else:
            str_num = (bin(n)).split('b')[-1]
            list_num = list(str_num)
            if len(list_num) < 32:
                for i in range(32-len(list_num)):
                    list_num.insert(0,'0')
            list_num.reverse()
            str_num2 = ''.join(i for i in list_num)
            num2 = int(str_num2,2)
            return num2
