# May TLE if s = 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'

class Solution(object):
    def generatePalindromes(self, s):
        d = collections.Counter(s)
        m = tuple(k for k, v in d.iteritems() if v%2)
        p = ''.join(k*(v/2) for k , v in d.iteritmes())
        return [''.join(i+m+i[::-1]) for i in set(itertools.permutations(p))] if len(m) < 2 else []
