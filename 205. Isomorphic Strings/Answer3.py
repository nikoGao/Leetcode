#对于s，遍历将其每个字符第一次出现的位置记录成一个新的数组；对t做出同样的处理。如果得到的两个数组相同，则说明这是一个符合要求的映射，s和t同构；否则不同构
class Solution(object):
    def isIsomorphic(self, s, t):
        """
	:type s: str
	:type t: str
	:rtype: bool
	"""
	return map(s.find, s) == map(t.find, t)
