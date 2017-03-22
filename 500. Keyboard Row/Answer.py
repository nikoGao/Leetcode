class Solution(object):

    def findWords(self, words):

        """

        :type words: List[str]

        :rtype: List[str]

        """

        result = []

        dict_map = {'row1':'qwertyuiop', 'row2': 'asdfghjkl', 'row3': 'zxcvbnm'}

        for word in words:

            for each in dict_map:

                if word[0].lower() in dict_map[each]:

                    i = 0

                    for every in word:

                        if every.lower() not in dict_map[each]:

                            break

                        else:

                            i += 1

                    if i == len(word):

                        result.append(word)

                else:

                    continue

        return result             
