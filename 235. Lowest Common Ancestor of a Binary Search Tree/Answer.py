#First, BST:左支的值< root.val, 右支的值> root.val
#Second, LCA：1.两个val, 一个在左边，一个在右边，则LCA=root  2.Two vals, both on the left/right, then the LCA is on the left/right.
#So what we need to do is to compare the vals of root, and two nodes.
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

        if not root: return root

        if p.val > q.val: return self.lowestCommonAncestor(root, q, p)

        if root.val >= p.val and root.val <= q.val: return root

        if root.val < p.val: return self.lowestCommonAncestor(root.right, p, q)

        if root.val > q.val: return self.lowestCommonAncestor(root.left, p, q)

