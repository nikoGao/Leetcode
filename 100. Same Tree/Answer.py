# Run time 35ms(96.56%)
#解题思路：
#1.递归问题，遍历
#2.首先特殊情况：两者均为空
#3.普遍情况：抽象成一个点，判断值是否相同？左支点相同？右支点相同？
#4.重复步骤2

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if not p and not q:
            return True
        if p and q and p.val == q.val:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right,q.right)
        return False
