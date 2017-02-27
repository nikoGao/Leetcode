#广度遍历，树高度初始值为-1
#depth()判断每个子树之间的高度差
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def depth(self, root):
        if not root:
            return 0
        left, right = self.depth(root.left), self.depth(root.right)
        if left >= 0 and right >= 0 and abs(left-right) <= 1:
            return max(left, right) + 1
        return -1
        
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.depth(root) >= 0
