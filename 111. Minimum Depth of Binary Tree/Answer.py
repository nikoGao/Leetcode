#分析：分为三种情况：1）结点为空，返回0； 2）根结点只存在左子树或者右子树，返回左子树或者右子树的最小深度+1； 3）根结点的左右子树都存在，返回两者最小深度的较小值+1

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        if root.left == None and root.right != None:
            return self.minDepth(root.right) + 1
        if root.left != None and root.right == None:
            return self.minDepth(root.left) + 1
        return min( self.minDepth( root.left ), self.minDepth( root.right ) ) + 1
