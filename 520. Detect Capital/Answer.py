class Solution(object):

    def detectCapitalUse(self, word):

        """

        :type word: str

        :rtype: bool

        """

        if word[0].islower():

            if word.islower():

                return True

        if word[0].isupper():

            if word.isupper() or word[1:].islower():

                return True

        return False
