# Use iteration: inorder recursion(中序遍历), So use stack, the order is left, root, right
# So from root, push(), then find left, if root.left still has left, push(). So on, until the last left does not have left child, then pop(), and find its right child, until the root is None and stack is empty
# Run time 52ms 

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def iterationTree(self, root, vallist):
        stack = []
        while root or stack:
            if root:
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                vallist.append(root.val)
                root = root.right
        return vallist
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        vallist = []
        self.iterationTree(root, vallist)
        return vallist
