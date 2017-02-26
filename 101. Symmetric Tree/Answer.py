#思路与Q.100相同
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def compare(self, p, q):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if p == None and q == None: 
            return True
        if p and q and p.val == q.val:
            return self.compare(p.right, q.left) and self.compare(p.left, q.right)
        else:
            return False
    
    def isSymmetric(self, root):
        if root == None:
            return True
        return self.compare(root.left, root.right)
