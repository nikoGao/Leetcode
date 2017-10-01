# Not use bit manipulation
# Easy to understand & write
class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        result = []
        i = len(a)-1
        j = len(b)-1
        carry = 0
        while(i >= 0 or j >= 0):
            temp = carry
            if(j>=0): temp += int(b[j])
            if(i >= 0): temp += int(a[i])
            result.insert(0, str(temp%2))
            carry = temp/2
            i -= 1
            j -= 1
        if(carry != 0): result.insert(0, str(carry))
        return ''.join(result)
