#根据题目描述的映射要求，s有多少种不同的字符，t也有多少种不同的字符。利用set()排除相同tuple
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
	return len(set(zip(s, t))) == len(set(s)) == len(set(t))
