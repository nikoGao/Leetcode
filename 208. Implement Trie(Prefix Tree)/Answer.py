# Time Limited Exceed

class Trie(object):



    def __init__(self):

        """

        Initialize your data structure here.

        """

        self.trie = []

        



    def insert(self, word):

        """

        Inserts a word into the trie.

        :type word: str

        :rtype: void

        """

        self.trie.append(word)



    def search(self, word):

        """

        Returns if the word is in the trie.

        :type word: str

        :rtype: bool

        """

        if self.trie == []: return False

        if word in self.trie:

            return True

        return False

        



    def startsWith(self, prefix):

        """

        Returns if there is any word in the trie that starts with the given prefix.

        :type prefix: str

        :rtype: bool

        """

        if self.trie == []: return False

        for each in self.trie:

            if each.startswith(prefix):

                return True

        return False

        





# Your Trie object will be instantiated and called as such:

# obj = Trie()

# obj.insert(word)

# param_2 = obj.search(word)

# param_3 = obj.startsWith(prefix)
