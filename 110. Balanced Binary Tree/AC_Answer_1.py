# O(n^2) time use bfs

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def depth(self, root):
        if root==None: return 0
        return max(depth(root.left),depth(root.right))+1
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root==None: return True
        left = depth(root.left)
        right = depth(root.right)
        return abs(left-right)==1 and self.isBalanced(root.left) and self.isBalanced(root.right)
        
