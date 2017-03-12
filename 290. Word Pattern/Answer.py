class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        patterns = list(pattern)
        strings = str.split(' ')
        if len(pattern) == len(strings):
            return len(set(zip(patterns, strings))) == len(set(patterns)) == len(set(strings))
        else:
            return False
