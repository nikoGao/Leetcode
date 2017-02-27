#二叉树dfs遍历
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def walk(self, root, level, res):
        if root: 
            if len(res)< level+1:
                res.append([])
            res[level].append(root.val)
            self.walk(root.left, level+1, res)
            self.walk(root.right, level+1, res)
    
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        res = []
        self.walk(root, 0, res)
        res.reverse()
        return res
