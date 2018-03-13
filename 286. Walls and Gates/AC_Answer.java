public class Solution{
	public void wallsAndGates(int[][] rooms) {
		for(int i=0; i<rooms.length; i++){
			for(int j=0; j<rooms[0].length; j++){
				if(rooms[i][j]==0)
					dfs(rooms, i, j, 0);
			}
		}
	}

	public void dfs(int[][] rooms, int row, int col, int steps){
		if(row<0 || row >= rooms.length || col<0 || col>=rooms[0].length || steps>rooms[i][j]) return;
		rooms[i][j] = steps;
		dfs(rooms, row-1, col, steps+1);
		dfs(rooms, row, col-1, steps+1);
		dfs(rooms, row+1, col, steps+1);
		dfs(rooms, row, col+1, steps+1);
	}
}