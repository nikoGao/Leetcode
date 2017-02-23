class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        @KMF
        """
        len1 = len(haystack)
        len2 = len(needle)
        next = [-1 for i in range(len2+1)]
        self.Prefix(needle, next, len2)
        i = 0; j = 0
        while i < len1 and j < len2:
            if j == -1 or haystack[i] == needle[j]:
                i+=1;j+=1
            else:
                j = next[j]
        if j < len2:
            return -1
        else:
            return i - len2
        
    def Prefix(self, needle, next, len2):
        i = 0;j = -1
        while i < len2 -1:
            if (j == -1) or (needle[i] == needle[j]):
                i += 1
                j += 1
                next[i] = j
            else:
                j = next[j]
