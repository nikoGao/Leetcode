#利用python的list comprehension以及string的isalnum()函数
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        newS = [i.lower() for i in s if i.isalnum()]
        return newS[:len(newS)/2] == newS[(len(newS)+1)/2:][::-1] 
