#运用指针j将list重新排序，同时以j作为长度计量单位
#i作为遍历变量
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        list1 = nums
        if not nums:
            return 0
        else:
            j = 0
            for i in range(0,len(nums)):
                if list1[i] != list1[j]:
                    list1[i], list1[j+1] = list1[j+1], list1[i]
                    j += 1
            return j+1
