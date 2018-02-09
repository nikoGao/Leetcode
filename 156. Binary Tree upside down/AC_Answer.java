class Solution{
	public TreeNode UpsideDownBinaryTree(TreeNode root){
		TreeNode node = root, right = null, parent = null;
		while(node != null){
			TreeNode left = node.left;
			node.left = right;
			right = node.right;
			node.left = parent;
			parent = node;
			node = left;
		}
		return parent;
	}
}