# Use queue to label all leaves, and remember the first in queue is always right leaf if its parent has
# Then if there is no right leaves, its left leaf turn
# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def rightSideView(self, root):

        """

        :type root: TreeNode

        :rtype: List[int]

        """

        ans = []

        if root is None: return ans

        queue = [root]

        while queue:

            size = len(queue)

            for i in range(size):

                top = queue.pop(0)

                if i == 0:

                    ans.append(top.val)

                if top.right:

                    queue.append(top.right)

                if top.left:

                    queue.append(top.left)

        return ans
