# Use re.compile, but time exceed limited
import re

class WordDictionary(object):



    def __init__(self):

        """

        Initialize your data structure here.

        """

        self.stack = []



    def addWord(self, word):

        """

        Adds a word into the data structure.

        :type word: str

        :rtype: void

        """

        self.stack.append(word)

        



    def search(self, word):

        """

        Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.

        :type word: str

        :rtype: bool

        """

        if '.' not in word:

            if word in self.stack:

                return True

            else:

                return False

        else:

            r = re.compile(word)

            newlist = filter(r.match, self.stack)

            newlist = [each for each in newlist if len(each) == len(word)]

            if newlist != []:

                return True

            else:

                return False





# Your WordDictionary object will be instantiated and called as such:

# obj = WordDictionary()

# obj.addWord(word)

# param_2 = obj.search(word)
