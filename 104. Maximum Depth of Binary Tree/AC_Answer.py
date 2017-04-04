# Run time 82ms
# space O(1)

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root:
            depth = 1
            depth += max(self.maxDepth(root.left), self.maxDepth(root.right))
            return depth
        return 0
        
