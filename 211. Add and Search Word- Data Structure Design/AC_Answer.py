# use collections.defaultdict(list)

class WordDictionary(object):



    def __init__(self):

        """

        Initialize your data structure here.

        """

        self.stack = collections.defaultdict(list)



    def addWord(self, word):

        """

        Adds a word into the data structure.

        :type word: str

        :rtype: void

        """

        if word:

            self.stack[len(word)].append(word)

        



    def search(self, word):

        """

        Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.

        :type word: str

        :rtype: bool

        """

        if not word: return False

        if '.' not in word:

            return word in self.stack[len(word)]

        for letter in self.stack[len(word)]:

            for i, val in enumerate(word):

                if letter[i] != val and val != '.':

                    break

            else:

                return True

        return False





# Your WordDictionary object will be instantiated and called as such:

# obj = WordDictionary()

# obj.addWord(word)

# param_2 = obj.search(word)
