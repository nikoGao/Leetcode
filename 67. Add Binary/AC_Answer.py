# Use bit manipulate, but the O(n) maybe larger

class Solution(object):

    def addBinary(self, a, b):

        """

        :type a: str

        :type b: str

        :rtype: str

        """

        if len(a) == 0: return b

        if len(b) == 0: return a

        if int(a[-1]) & int(b[-1]):

            return self.addBinary(self.addBinary(a[0:-1], b[0:-1]), str(int(a[-1]) & int(b[-1]))) + str(int(a[-1]) ^ int(b[-1]))

        else:

            return self.addBinary(a[0:-1], b[0:-1]) + str(int(a[-1]) ^ int(b[-1]))
