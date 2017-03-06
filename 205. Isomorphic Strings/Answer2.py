#为了避免在成立dict后还要做‘是否有重复 的判断，在遍历时将已经映射过的值保存在mapval这个dict中
class Solution(object):
    def isIsomorphic(self, s, t):
        """
	:type s: str
	:type t: str
	:rtype: bool
	"""
	hashmap = {}
	mapval = {}
	for i in xrange(len(s)):
	    if s[i] in hashmap:
	        if hashmap[s[i]] != t[i]:
		    return False
		elif t[i] in mapval:
		    return False
		else:
		    hashmap[s[i]] = t[i]
		    mapval[t[i]] = True
        return True
