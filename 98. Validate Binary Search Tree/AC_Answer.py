# Run time 62ms(98.27%)

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def validBST(self, root, minval, maxval):

        if not root:

            return True

        if root.val<= minval or root.val>=maxval:

            return False

        return self.validBST(root.left, minval, root.val) and self.validBST(root.right, root.val, maxval)

    def isValidBST(self, root):

        """

        :type root: TreeNode

        :rtype: bool

        """

        return self.validBST(root, -2147483649, 2147483648)
