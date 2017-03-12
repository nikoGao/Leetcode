class Solution(object):
    def generatePossibleNextMoves(self, s):
        """
	:type s: str
	:rtype: List[str]
	"""
	res = []
	if len(s) < 2 or (len(s)==2 and s[0] != s[1]):
	    return res
	for i in range(len(s)-1):
	    if s[i] == '-' or s[i+1] != s[i]:
	        continue
	    res.append(s[0:i]+ '--'+ s[i+2:])
	return res
