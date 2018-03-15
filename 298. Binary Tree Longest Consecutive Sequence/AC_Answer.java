public class Solution{
	public int longestConsecutive(TreeNode root) {
		if(root==null) return 0;
		return findLength(root, 0, root.val-1);
	}

	public int findLength(TreeNode root, int length; int prev){
		if(root==null) return length;
		int cur = pre + 1 == root.val ? length+1: 1;
		return Math.max(findLength(root.left, length, root.val), findLength(root.right, length, root.val));
	}
}