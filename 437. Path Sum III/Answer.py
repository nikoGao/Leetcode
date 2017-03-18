#Same as 112, the difference is that each node can be the start, so use loop and treat each node as the root. 
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: int
        """
        def transfer(root, val):
            if not root: return 0
            res = (val == root.val)
            res += transfer(root.left, val- root.val)
            res += transfer(root.right, val-root.val)
            return res
        if root == None:
            return 0
        ans = transfer(root, sum)
        ans += self.pathSum(root.left, sum)
        ans += self.pathSum(root.right, sum)
        return ans
            
