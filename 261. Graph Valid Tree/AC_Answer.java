public class Solution{
	//to detect if there is a circle in the graph and whether each node has been visited
	public boolean validTree(int n, int[][] edges) {
		Map<Integer, List<Integer>> res = new HashMap<>();
		for(int i=0; i<n; i++){
			res.put(i, new ArrayList<>());
		}
		for(int[] edge: edge){
			res.get(edge[0]).add(edge[1]);
			res.get(edge[1]).add(edge[0]);
		}

		boolean[] visited = new boolean[n];

		if(!helper(0, -1, res, visited)) return false;
		for(boolean v:visited){
			if(!v) return false;
		}
		return true;
	}

	public boolean helper(int cur, int parent, Map<Integer, List<Integer>> edges, boolean[] visited){
		if(visited[cur]) return false;
		visited[cur] = true;
		for(int i:edges.get(cur)){
			if(i!=parent && !helper(i, cur, edges, visited)) return false;
		}
		return true;
	}
}