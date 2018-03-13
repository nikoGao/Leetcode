public class Solution{
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while(cur != p){
			stack.push(cur);
			if(cur.val > p.val) cur = cur.left;
			else if(cur.val < p.val) cur = cur.right;
		}

		if(cur.right !=null){
			cur = cur.right;
			while(cur.left){
				cur = cur.left;
			}
			return cur.left;
		}else{
			while(!stack.isEmpty() && stack.peek().val < cur.val){
				stack.pop();
			}
			return stack.isEmpty()? null : stack.pop();
		}
	}
}