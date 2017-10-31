// notice it's a BST
public class Solution{
	int goal;
	double min = Double.MAX_VALUE;
	public int closetValue(TreeNode root, double target){
		helper(root, target);
		return goal;
	}
	public void helper(TreeNode root, double target){
		if(root==null) return;
		if(Math.abs(root.value-target)<min){
			min = Math.abs(root.value-target);
			goal = root.value;
		}
		if(target< root.value) helper(root.left, target);
		else helper(root.right, target); 
	}
}