class codec:
    def encode(self, strs):
        """Encodes a list of strings to a single string.
        :type strs: List[str]
        :rtype: str
        """
        s = ""
        for i in strs:
            s += str(len(i)) + '#' + i
        return s
    
    def decode(self, s):
        """Decode a sing string to a list of strings
        :type s: str
        :rtype: List[str]
        """
        i, str = 0, []
        while i<len(s):
            sharp = s.find('#', i)
            l = int(s[i:sharp])
            str.append(s[sharp+1: sharp+l+1])
            i = sharp + l + 1
        return str
