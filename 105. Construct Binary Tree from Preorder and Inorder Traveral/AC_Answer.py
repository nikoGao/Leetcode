# 看到树首先想到要用递归来解题。以这道题为例：如果一颗二叉树为{1,2,3,4,5,6,7}，则中序遍历为{4,2,5,1,6,3,7}，后序遍历为{4,5,2,6,7,3,1}，我们可以反推回去。由于后序遍历的最后一个节点就是树的根。也就是root=1，然后我们在中序遍历中搜索1，可以看到中序遍历的第四个数是1，也就是root。根据中序遍历的定义，1左边的数{4,2,5}就是左子树的中序遍历，1右边的数{6,3,7}就是右子树的中序遍历。而对于后序遍历来讲，一定是先后序遍历完左子树，再后序遍历完右子树，最后遍历根。于是可以推出：{4,5,2}就是左子树的后序遍历，{6,3,7}就是右子树的后序遍历。而我们已经知道{4,2,5}就是左子树的中序遍历，{6,3,7}就是右子树的中序遍历。再进行递归就可以解决问题了。

# Definition for a binary tree node.

# class TreeNode(object):

#     def __init__(self, x):

#         self.val = x

#         self.left = None

#         self.right = None



class Solution(object):

    def buildTree(self, preorder, inorder):

        """

        :type preorder: List[int]

        :type inorder: List[int]

        :rtype: TreeNode

        """

        if len(preorder) == 0:

            return None

        if len(preorder) == 1:

            return TreeNode(preorder[0])

        root = TreeNode(preorder[0])

        index = inorder.index(root.val)

        root.left = self.buildTree(preorder[1:index+1], inorder[:index])

        root.right = self.buildTree(preorder[index+1: len(preorder)], inorder[index+1:])

        return root
