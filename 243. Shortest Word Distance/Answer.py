#two points for the index of two words, straight from the start to the end.
#each time, there is one point that is stable.

# Time:  O(n)
# Space: O(1)

class Solution:
    # @param {string[]} words
    # @param {string} word1
    # @param {string} word2
    # @return {integer}
    def shortestDistance(self, words, word1, word2):
        dist = float("inf")
        i, index1, index2 = 0, None, None
        while i < len(words):
            if words[i] == word1:
                index1 = i
            elif words[i] == word2:
                index2 = i

            if index1 not None and index2 not None:
                dist = min(dist, abs(index1-index2))
            i += 1
        return dist
