# The solution is dfs and use a stack to store all its elem in order
# Since its a BST, so find the most left node first, then root, then right

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def dfs(self, node, count):

        if not node:

            return

        self.dfs(node.left, count)  #Notice the order of these three

        count.append(node.val)

        self.dfs(node.right, count)

        

    def kthSmallest(self, root, k):

        """

        :type root: TreeNode

        :type k: int

        :rtype: int

        """

        ans = []

        self.dfs(root, ans)

        return ans[k-1]

        
