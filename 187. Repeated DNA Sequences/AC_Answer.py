# Still slow, not with KVM

class Solution(object):

    def findRepeatedDnaSequences(self, s):

        """

        :type s: str

        :rtype: List[str]

        """

        substrings = collections.defaultdict(int)

        for i in range(len(s)):

            substrings[s[i:i+10]] += 1

        return [key for key, value in substrings.items() if value > 1]
