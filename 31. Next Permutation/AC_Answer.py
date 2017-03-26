#输出字典序中的下一个排列。比如123生成的全排列是：123，132，213，231，312，321。那么321的next permutation是123。下面这种算法据说是STL中的经典算法。在当前序列中，从尾端往前寻找两个相邻升序元素，升序元素对中的前一个标记为partition。然后再从尾端寻找另一个大于partition的元素，并与partition指向的元素交换，然后将partition后的元素（不包括partition指向的元素）逆序排列。比如14532，那么升序对为45，partition指向4，由于partition之后除了5没有比4大的数，所以45交换为54，即15432，然后将partition之后的元素逆序排列，即432排列为234，则最后输出的next permutation为15234。确实很巧妙。

class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if not len(nums):
            return 
        idx = len(nums)-2
        while idx >=0 and nums[idx] >= nums[idx+1]:
            idx -= 1
        
        if idx >= 0:
            i = idx + 1
            while i < len(nums) and nums[i] > nums[idx]:
                i += 1
            nums[idx], nums[i-1] = nums[i-1], nums[idx]
            
        l, r = idx+1, len(nums)-1
        while l<=r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
        
