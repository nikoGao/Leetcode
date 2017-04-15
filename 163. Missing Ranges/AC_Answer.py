class Solution:
    def findMissingRanges(self, nums, lower, upper):
        res = []
        if nums is None or len(nums) == 0:
	    if upper-lower >= 1:
		res.append(str(lower)+ '->' + str(upper))
	    else:
	        res.append(str(lower))
	for i in range(len(nums)):
	    if i == 0 and nums[i] - lower >1:
	        res.append(str(lower)+'->'+str(numw[0]-1))
	    else:
	        if i == 0 and nums[i]- lower == 1:
		    res.append(str(lower))
	    if i > 0 and nums[i]-nums[i-1] > 2:
	        res.append(str(nums[i-1]+1)+'->'+str(nums[i]-1))
	    else:
	        if i > 0 and nums[i]-nums[i-1] == 2:
		    res.append(str(nums[i-1]+1))
             if i == len(nums)-1:
	         if upper - nums[i] > 1:
		     res.append(str(nums[i]+1)+'->'+str(upper-1))
		 else:
		     if upper -nums[i] == 1:
		         res.append(str(upper))
	return res
	        
