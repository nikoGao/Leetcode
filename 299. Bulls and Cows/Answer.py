# Time Limit Exceed

class Solution(object):
    def getHint(self, secret, guess):
        """
        :type secret: str
        :type guess: str
        :rtype: str
        """
        b, c = 0, 0
        length = len(secret)
        secret = list(secret)
        guess = list(guess)
        for i in range(length):
            if guess[i] == secret[i]:
                b += 1
                guess[i] = secret[i] = 'B'
        for i in range(length):
            if guess[i].isdigit() and guess[i] in secret:
                c += 1
                location = secret.index(guess[i])
                guess[i] = secret[location] = 'C'
        return str(b)+'A'+str(c)+'B'
                    
