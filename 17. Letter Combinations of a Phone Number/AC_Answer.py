# Divide the num_str into the first letter and rest. Use the think of recursion. Each time, combine the representation of first letter and the rest's. But the disdadvantage is the O(n^2)

class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        dictLetter = {0:' ', 1:'', 2:'abc', 3:'def', 4:'ghi', 5:'jkl', 6:'mno', 7:'pqrs', 8:'tuv', 9:'wxyz'}
        length = len(digits)
        if length == 0:
            return []
        
        intVal = int(digits[0])
        result = []
        arr = []
        firstLetter = dictLetter[intVal]
        for i in firstLetter:
            if length > 1:
                arr = self.letterCombinations(digits[1:])
                for j in arr:
                    result.append(i + j)
            else:
                result.append(i)
        return result
