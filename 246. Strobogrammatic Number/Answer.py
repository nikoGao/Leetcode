#build a map on the number that are strobogrammtic, then use two points to verify the map.
class Solution:
    # @param {string} num
    # @return {boolean}
    def isStrobogrammatic(self, num):
        dic = {'9':'6', '8': '8', '6': '9', '1': '1', '0': '0'}
        l, r = 0, len(num)-1
        while l<= r:
            if num[l] not in dic or dic[num[l]] != num[r]:
                return False
            l += 1
            r -= 1
        return True
