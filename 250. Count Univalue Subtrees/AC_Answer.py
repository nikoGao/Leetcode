class Solution:
    def __init__(self):
        self.count = 0
    def countUnivalSubtrees(self, root):
        self.unival(root)
        return self.count

    def unival(self, root):
        if root == None:
            return True
        if root.left is None and root.right is None:
            self.count += 1
            return True
        left = self.unival(root.left)
        right = self.unival(root.right)
        if left and right and (left is None or left.val==root.val) and (right is None or right.val==root.val):
            self.count += 1
            return True
        else:
            return False
