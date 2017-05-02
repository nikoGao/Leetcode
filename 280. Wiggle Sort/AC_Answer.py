# O(nlgn) time is easy

class Solution:
    def wiggleSort(self, nums):
        if len(nums) < 2:
	    return nums
	nums.sort()
	for i in range(2, len(nums), 2):
	    temp = nums[i-1]
	    nums[i-1] = nums[i]
	    nums[i] = temp
	return nums
