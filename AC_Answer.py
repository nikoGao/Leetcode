# User recursion
# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def preorderTraversal(self, root):

        """

        :type root: TreeNode

        :rtype: List[int]

        """

        def preorder(root, value):

            if root == None:

                return value

            value.append(root.val)

            preorder(root.left,value)

            preorder(root.right, value)

            

        value = []

        preorder(root, value)

        return value
