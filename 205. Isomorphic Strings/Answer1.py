class Solution(object):
    def isIsomorphic(self, s, t):
        """
	:type s: str
	:type t: str
	:rtype: bool
	"""
	dict1 = {}
	for i in range(len(s)):
	    if s[i] not in dict1.keys():
	        dict1[s[i]] = t[i]
	    elif dict1[s[i]] != t[i]:
	        return False
	mapval = [dict1[k] for k in dict1]
	return len(mapval) == len(set(mapval))
