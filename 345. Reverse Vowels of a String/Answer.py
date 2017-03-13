class Solution(object):

    def reverseVowels(self, s):

        """

        :type s: str

        :rtype: str

        """

        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

        strings = list(s)

        i, j = 0, len(s)-1

        while i < j:

            if s[i].isalpha() and s[j].isalpha():

                if s[i] in vowels and s[j] not in vowels:

                    j -= 1

                    continue

                if s[i] not in vowels and s[j] in vowels:

                    i += 1

                    continue

                if s[i] in vowels and s[j] in vowels:

                    strings[i], strings[j] = strings[j], strings[i]

            if s[i].isalpha() and not s[j].isalpha():

                j -= 1

                continue

            if not s[i].isalpha() and s[j].isalpha():

                i += 1

                continue

            i += 1

            j -= 1

        return ''.join(i for i in strings)
