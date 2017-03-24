# Thought: use the current elem as mid of palindrome, verify its left and right side.
# Need to consider two conditions: first, the palindrome length is odd; second, the palindrome length is even.

class Solution(object):

    def findLongestPalindrome(self, s, l, r):

        while l>=0 and r<len(s) and s[l] == s[r]:

            l -= 1; r += 1;

        return s[l+1: r]

        

    def longestPalindrome(self, s):

        """

        :type s: str

        :rtype: str

        """

        palindrome = ''

        for i in range(len(s)):

            len1 = len(self.findLongestPalindrome(s, i, i))  #caculate odd palindrome

            if len1 > len(palindrome): palindrome = self.findLongestPalindrome(s, i, i)

            len2 = len(self.findLongestPalindrome(s, i, i+1)) #caculate even palindrome

            if len2 > len(palindrome): palindrome = self.findLongestPalindrome(s, i, i+1)

        return palindrome
