# In this case, x and y are strings, so x+y means concatenate it together, then cpm means compare them.
# So we can got the result which combination have larger number
class Solution:

    # @param {integer[]} nums

    # @return {string}

    def largestNumber(self, nums):

        strings = [str(num) for num in nums]

        strings.sort(cmp=lambda x, y:cmp(y+x, x+y))

        return ''.join(strings).lstrip('0') or '0'
