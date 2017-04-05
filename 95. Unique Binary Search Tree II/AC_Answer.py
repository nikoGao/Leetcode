# Use the characterstic to build a binary search tree. Left Tree < Root< RightTree. So choose a root, then all item between[start, root-1] will in LeftTree, all item between [root+1, end] in Right Tree. Recursion

# Run time 78ms(96.35%)

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def dfs(self, start, end):

        if start > end: return [None]

        res = []

        for rootval in range(start, end+1):

            LeftTree = self.dfs(start, rootval-1)

            RightTree = self.dfs(rootval+1, end)

            for i in LeftTree:

                for j in RightTree:

                    root = TreeNode(rootval)

                    root.left = i

                    root.right = j

                    res.append(root)

        return res

    def generateTrees(self, n):

        if not n: return []

        return self.dfs(1, n)

