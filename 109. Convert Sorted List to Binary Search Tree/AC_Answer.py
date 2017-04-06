# Easy way, stored the val of linked list first, then convert this question to arry -> binary tree

# Run time 258ms

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def buildTree(self, inorder, postorder):

        """

        :type inorder: List[int]

        :type postorder: List[int]

        :rtype: TreeNode

        """

        if len(inorder) == 0:

            return None

        if len(inorder) == 0:

            return TreeNode(postorder[0])

        root = TreeNode(postorder[len(postorder)-1])

        index = inorder.index(root.val)

        root.right = self.buildTree(inorder[index+1:], postorder[index:len(postorder)-1])

        root.left = self.buildTree(inorder[:index], postorder[:index])

        return root
