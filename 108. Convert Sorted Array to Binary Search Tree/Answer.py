#构造二叉树
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def walk(self, nums, left, right):
        if left == right:
            return None
        mid = (left + right) / 2
        root = TreeNode(nums[mid])
        root.left = self.walk(nums, left, mid)
        root.right = self.walk(nums, mid+1, right)
        return root
        
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        length = len(nums)
        return self.walk(nums, 0, length)
