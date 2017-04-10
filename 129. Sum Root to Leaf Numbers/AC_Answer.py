# Run time 58ms

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def sumLeaves(root, total):
            if root == None:
                return 0
            if root.left == None and root.right == None:
                return total*10 + root.val
            return sumLeaves(root.left, total*10+root.val) + sumLeaves(root.right, total*10+root.val)
        return sumLeaves(root, 0)
