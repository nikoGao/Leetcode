# Using a bottom-up approach, we can improve over the top-down approach by avoiding traversing the same nodes over and over again.
# We traverse from the bottom, and once we reach a node which matches one of the two nodes, we pass it up to its parent. The parent would then test its left and right subtree if each contain one of the two nodes. If yes, then the parent must be the LCA and we pass its parent up to the root. If not, we pass the lower node which contains either one of the two nodes (if the left or right subtree contains either p or q), or NULL (if both the left and right subtree does not contain either p or q) up.

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def lowestCommonAncestor(self, root, p, q):

        """

        :type root: TreeNode

        :type p: TreeNode

        :type q: TreeNode

        :rtype: TreeNode

        """

        if not root or root== p or root==q: return root

        left = self.lowestCommonAncestor(root.left, p, q)

        right = self.lowestCommonAncestor(root.right, p, q)

        if left and right:

            return root

        return left if left else right
