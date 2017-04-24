# n == 1: [0, 1, 8]

# n == 2: [11, 88, 69, 96]

# How about n == 3?
# => it can be retrieved if you insert [0, 1, 8] to the middle of solution of n == 2

# n == 4?
# => it can be retrieved if you insert [11, 88, 69, 96, 00] to the middle of solution of n == 2

# n == 5?
# => it can be retrieved if you insert [0, 1, 8] to the middle of solution of n == 4

# the same, for n == 6, it can be retrieved if you insert [11, 88, 69, 96, 00] to the middle of solution of n == 4

class Solution:
    def findStrobogrammatic(self, n):
        oddStrobogrammatic = ['0', '1', '8']i
        evenStrobogrammatic = ['11', '69', '88', '96']
        if n == 1:
            return oddStrobogrammatic
        if n == 2:
            return evenStrobogrammatic
        if n % 2:
            pre, midCandidate = self.findStrobogrammatic(n-1), oddStrobogrammatic
        else:
            pre, midCandidate = self.findStrobogrammatic(n-2), evenStrobogrammatic
        premid = (n-1)/2
        return [p[:premid]+c+p[premid:] for c in midCandidate for p in pre]
