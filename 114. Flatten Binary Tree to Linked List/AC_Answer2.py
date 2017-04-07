# Use stack
# Run time 52ms

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):



    def flatten(self, root):

        """

        :type root: TreeNode

        :rtype: void Do not return anything, modify root in-place instead.

        """

        point = TreeNode(None)

        stack = [root]

        while stack:

            top = stack.pop()

            if top == None:

                continue

            stack.append(top.right)

            stack.append(top.left)

            point.right = top

            point.left = None

            point = top

        
