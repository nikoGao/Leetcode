# Use greedy method: O(n) time
# when label is odd, nums[i]>= nums[i-1]
# when label is even, nums[i] <= nums[i-1]

class Solution:
    def wiggleSort(self, n):
        if len(nums) < 2: return
	for i in range(1, len(nums)):
	    if (i % 2 == 1 and nums[i]< nums[i-1]) or (i%2==0 and nums[i]>nums[i-1]):
	        nums[i-1], nums[i] = nums[i], nums[i-1]

