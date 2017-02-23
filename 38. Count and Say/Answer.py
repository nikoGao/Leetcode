#模拟法+迭代
#具体思路有待理清
class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = '1'
        for i in range(2,n+1):
            s = self.count(s)
        return s
    
    def count(self, s):
        temp = '';count = 0;curr = '*'
        for i in s:
            if i != curr:
                if curr != '*':
                    temp += str(count) + curr
                curr = i
                count = 1
            else:
                count += 1
        temp += str(count) + curr
        return temp
