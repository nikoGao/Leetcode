#This is a greedy problem, in each step we need to check fastest reach step. If there is any step cannot help we step further that means we cannot reach the end.

class Solution(object):

    def canJump(self, nums):

        """

        :type nums: List[int]

        :rtype: bool

        """

        index=0  

        reach=0  

        if len(nums)<=1:  

            return True  

        while index<len(nums):  

            if reach<index:  

                return False  

            reach=max(reach,nums[index]+index)  

            index+=1  

        return True 
