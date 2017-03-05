#以n-k为分界线， 分别对数组两边进行对调，然后将数组整体逆序
class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k %= n
        self.reverse(nums, 0, n-k)
        self.reverse(nums, n-k, n)
        self.reverse(nums, 0, n)
        
    def reverse(self, nums, start, end):
        for x in range(start, (start+end)/2):
            nums[x] ^= nums[start + end - x -1]
            nums [start+end-x-1] ^= nums[x]
            nums[x] ^= nums[start + end - x -1]
