class Solution(object):
    def editone(self, str1, str2):
        m = len(str1)
        n = len(str2)
        if m < n:
            return self.editone(str2, str1)
        if abs(m-n) > 1:
            return False
        diff = 0
        i = 0
        if m == n:
            while i < n:
                if str1[i] != str2[i]:
                    diff += 1
                if diff > 1:
                    return False
                i += 1
            return True
        else:
            for i in range(n):
                if str1[i] != str2[i]:
                    return str1[i+1:] == str2[i:]
