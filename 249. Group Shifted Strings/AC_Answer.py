# To identify each group, compute the modulo 26 difference between each letter in a word with the first letter in it.

class Solution:
    def groupStrings(self, strings):
        dic = collections.defaultdict(list)
        for s in strings:
            if len(s) == 1:
                dict[(1)].append(s)
            else:
                seq = (1,)
                for i in xrange(1, len(s)):
                    d = ord(s[i])-ord(s[i-1])
                    if d<0: d += 26
                    seq += (d,)
                dic[seq].append(s)
        return dic.values()
        
