class ValidWordAbbr(object):
    def __init__(self, dictionary):
        """
	initialize your data structure here.
	:type dictionary: List[str]
	"""
	self.dic = collections.defaultdict(set)
	for word in dictionary:
	    abbr = self.abbreviation(word)
	    self.dic[abbr].add(word)

    def isUnique(self, word):
        """
	check if a word is unique
	:type word: str
	:rtype: bool
	"""
	abbr = self.abbreviation(word)
	return self.dic[abbr]<={word}

    def abbreviation(self, word):
        if len(word)<=2:
	    return word
	return word[0] + str(len(word)-2) + word[-1]
