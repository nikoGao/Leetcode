class Solution(object):

    def canConstruct(self, ransomNote, magazine):

        """

        :type ransomNote: str

        :type magazine: str

        :rtype: bool

        """

        ransom = list(ransomNote)

        mag = list(magazine)

        for i in range(len(ransom)):

            if ransom[i] not in mag:

                return False

            else:

                mag.pop(mag.index(ransom[i]))

        return True
