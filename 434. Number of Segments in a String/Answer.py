import re
class Solution(object):
    def countSegments(self, s):
        """
        :type s: str
        :rtype: int
        """
        pattern = r"[^\s]+[\s]*" 
        pieces = re.findall(pattern, s)
        return len(pieces)
