#Time Limited Exceeding
class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        ls = len(s)
        lp = len(p)
        compare, result = [], []
        i = 0
        list1 = list(p)
        list1.sort()
        while i + lp <= ls:
            compare = list(s[i:i+lp])
            compare.sort()
            if compare == list1:
                    result.append(i)
            i += 1
        return result
