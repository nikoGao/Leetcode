class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        self.list1 = [n]
        while self.list1[-1] != 1:
            temp = self.caculate(self.list1[-1])
            if temp in self.list1:
                return False
            else:
                self.list1.append(temp)
        return True
        
    def caculate(self, num):
        temp = 0
        while num:
            temp += (num%10) ** 2
            num /= 10
        return temp
