class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        v1, v2 = (map(int, v.split('.')) for v in (version1, version2))
        d = len(v2) - len(v1)
        return cmp(v1 + [0]*d, v2 + [0]*-d)
        
