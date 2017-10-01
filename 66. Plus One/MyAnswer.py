# Thinking this way: if digits[i] < 9; then only need to add 1 and return results; otherwise, when for loop end, need to insert 1 at the first of the array

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        length = len(digits)
        for i in range(len(digits)):
            if(digits[length-i-1] < 9):
                digits[length-i-1] += 1;
                return digits;
            digits[length-i-1] = 0
        digits.insert(0,1)
        return digits
