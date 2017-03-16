# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def sumOfLeftLeaves(self, root):

        """

        :type root: TreeNode

        :rtype: int

        """

        value = 0

        if root:

            l, r = root.left, root.right

            if l and (l.left or l.right) is None:

                value += l.val

            value += self.sumOfLeftLeaves(l) + self.sumOfLeftLeaves(r)

        return value
