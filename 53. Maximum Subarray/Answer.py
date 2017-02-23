#假设A(0, i)区间存在k，使得[k, i]区间是以i结尾区间的最大值， 定义为Max[i], 在这里，当求取Max[i+1]时，Max[i+1] = Max[i] + A[i+1],  if (Max[i] + A[i+1] >0)
#            = 0, if(Max[i]+A[i+1] <0)，如果和小于零，A[i+1]必为负数，没必要保留，舍弃掉
#然后从左往右扫描，求取Max数字的最大值即为所求。
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total = 0
        maxs = -10000000000000000000
        for i in range(len(nums)):
            total += nums[i]
            if total > maxs:
                maxs = total
            if total < 0:
                total = 0
        return maxs
