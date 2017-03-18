class Solution(object):
    def vaildWordSquare(self, words):
    """
    :type words: List[str]
    :rtype: bool
    """
    length1 = len(words)
    length2 = len(words[0]) if m else 0
    if length1 != length2:
    	return False
    for x in range(length1):
        n = len(words[x])
	c = 0
	for y in range(n):
	"In the case that the length of each word is different, just like the second example"
	    if len(words[y]) < x + 1 :
	    	break
	    c += 1
	if c != n:
	    return False
	for y in range(n):
	    if words[x][y] != words[y][x]:
	        return False
    return True
