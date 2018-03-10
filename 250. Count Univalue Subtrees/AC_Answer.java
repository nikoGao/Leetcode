public class Solution{
	public int countUnivalSubtrees(TreeNode root){
		int res = 0;
		isUnivalue(root, -1, res);
		return res;
	}

	public void isUnivalue(TreeNode root, int val, int res){
		if(root==null) return true;
		if(!isUnivalue(root.left, root.val, res) || !isUnivalue(root.right, root.val, res)) return false;
		++res;
		return val==root.val;
	}
}