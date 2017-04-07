# 解题思路：首先将左右子树分别平化为链表，这两条链表的顺序分别为左子树的先序遍历和右子树的先序遍历。然后将左子树链表插入到根节点和右子树链表之间，就可以了。左右子树的平化则使用递归实现

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):



    def flatten(self, root):

        """

        :type root: TreeNode

        :rtype: void Do not return anything, modify root in-place instead.

        """

        if root == None:

            return

        self.flatten(root.left)

        self.flatten(root.right)

        p = root

        if p.left == None:

            return

        p = p.left

        while p.right:

            p = p.right

        p.right = root.right

        root.right = root.left

        root.left = None

        
