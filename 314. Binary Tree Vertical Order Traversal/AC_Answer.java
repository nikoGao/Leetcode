public class Solution{
	private class TreeNodeCol{
		private TreeNode node;
		private int col;
		public TreeNodeCol(TreeNode node, int col){
			this.node = node;
			this.col = col;
		}
	}

	public List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root==null){
			return res;
		}

		Queue<TreeNodeCol> q = new LinkedList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		q.offer(new TreeNodeCol(root, 0));
		// int curLevel = 1;
		// int nextLevel = 0;
		int min = 0;
		int max = 0;
		while(!q.isEmpty()){
			TreeNodeCol cur = q.poll();
			if(!map.containsKey(cur.col)){
				map.put(cur.col, new ArrayList<>());
			}
			map.get(cur.col).add(cur.node.val);
			if(cur.node.left != null){
				q.offer(new TreeNodeCol(cur.node.left, cur.col-1));
				min = Math.min(cur.col-1, min);
			}
			if(cur.node.right != null){
				q.offer(new TreeNodeCol(cur.node.right, cur.col+1));
				max = Math.max(cur.col+1, max);
			}
		}
		for(int i=min; i<=max; i++){
			res.add(map.get(i));
		}
		return res;
	}
}