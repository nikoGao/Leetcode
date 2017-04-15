class Solution:
    def UpsideDownBinaryTree(self, root):
        if root is None: return None
	prev, neighbor, cur = root, root.right, root.left
	while cur is not None:
	    cur_neighbor = cur.right
	    next = cur.left
	    cur.right = prev
	    cur.left = neighbor
	    prev = cur
	    neighbor = cur_neighbor
	    cur = next
	root.left = None
	root.right = None
	return prev

