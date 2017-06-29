class Solution(object):
    def longestConsecutive(self, root):
        return self.helper(root)[0]

    def helper(self, root):
        if not root:
            return 0, 0
        g_l, l_l = self.helper(root.left)
        g_r, l_r = self.helper(root.right)

        local = 1
        if root.left and root.val == root.left.val-1:
            local = l_l + 1
        if root.right and root.val = root.right.val -1:
            local = max(local, l_r+1)

        return max(g_l, g_r, local), local
