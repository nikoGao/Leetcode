#对于BST中的某节点N：

#大于N的最小节点为其右孩子的“极左节点”

#小于N的最大节点为其左孩子的“极右节点”
# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def getMinimumDifference(self, root):

        """

        :type root: TreeNode

        :rtype: int

        """

        left, right = root.left, root.right

        ans = 0x7FFFFFFF

        if left:

            while left.right: left = left.right

            ans = min(root.val - left.val, self.getMinimumDifference(root.left))

        if right:

            while right.left: right = right.left

            ans = min(ans, right.val - root.val, self.getMinimumDifference(root.right))

        return ans
