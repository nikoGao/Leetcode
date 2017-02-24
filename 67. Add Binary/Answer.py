class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        a_ten = int(a,2)
        b_ten = int(b,2)
        c_0b = bin(a_ten+b_ten)
        return c_0b.split('b')[-1]
