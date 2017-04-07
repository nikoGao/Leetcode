# DFS + ENUMERATE
# Run time 79ms

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def path(self, root, sum, path):

            if root.left == None and root.right == None:

                if sum == 0:

                    self.res.append(path)

            if root.left:

                self.path(root.left, sum-root.left.val, path+[root.left.val])

            if root.right:

                self.path(root.right, sum-root.right.val, path+[root.right.val])



    def pathSum(self, root, sum):

        """

        :type root: TreeNode

        :type sum: int

        :rtype: List[List[int]]

        """

        

        self.res = []

        if root==None: return []

        self.path(root, sum-root.val, [root.val])

        return self.res

            
