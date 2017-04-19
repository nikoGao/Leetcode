# compare the depth between left sub tree and right sub tree.
# A, If it is equal, it means the left sub tree is a perfect binary tree
# B, It it is not , it means the right sub tree is a perfect binary tree

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def countNodes(self, root):

        """

        :type root: TreeNode

        :rtype: int

        """

        if not root: return 0

        leftDepth = self.getDepth(root.left)

        rightDepth = self.getDepth(root.right)

        if leftDepth == rightDepth:

            return pow(2, leftDepth) + self.countNodes(root.right)

        else:

            return pow(2, rightDepth) + self.countNodes(root.left)

    

    def getDepth(self, root):

        if not root:

            return 0

        return self.getDepth(root.left) + 1

        
