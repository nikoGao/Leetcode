class Solution{
	public int[][] candyCrush(int[][] board){
		int row = board.length, col = board[0].length;
		List<int[2]> candidate = new ArrayList<>();
		while(true){
			for(int i=0; i<row; i++){
			for(int j=0;j<col; j++){
				if(board[i][j]==0) continue; // empyt space
				int xu = i-1, xd = i+1, yl = j-1, yr = j+1;
				while(xu>=0 && xu>i-3 && board[xu][j]==board[i][j]) xu--; // look up 
				while(xd<row && xd<i+3 && board[xd][j]==board[i][j]) xd++; // look down
				while(yl>=0 && yl>j-3 && board[i][yl]==board[i][j]) yl--; // look left
				while(yr<col && yr<j+3 && board[i][yr]==board[i][j]) yr++; // look right
				if(xd-xu>3 || yr-yl>3){
					// if there is a line with three or more same candy, current candy can be eliminated
					int[] pair = new int[2];
					pair[0] = i;
					pair[1] = j;
					candidate.add(pair);
					}
				}
			}
			if(candidate.size()==0) break; // no candy can be crushed, finish the program
			// label all candies in candidate as 0
			for(int[] p:candidate){
				board[p[0]][p[1]] = 0;
			}
			// drop down, from last row to the first
			// move all 0 forward
			for(int j=0; j<col; j++){
				int p1 = row-1;
				for(int i = row-1; i>=0; i--){
					if(board[i][j] != 0){
						// move 0 up
						int temp = baord[i][j];
						board[i][j] = board[p1][j];
						board[p1--][j] = temp;
					}
				}
			}
		}
		return baord;
	}
}