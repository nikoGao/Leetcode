#字谜游戏，两个strings排序看是否一致
class Solution(object):

    def isAnagram(self, s, t):

        """

        :type s: str

        :type t: str

        :rtype: bool

        """

        return sorted(s) == sorted(t)
