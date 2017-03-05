class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        bin_num = (bin(n)).split('b')[-1]
        weight = 0
        for elem in bin_num:
            if elem == '1':
                weight += 1
        return weight
