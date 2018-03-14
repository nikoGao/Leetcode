class Solution {
    public void gameOfLife(int[][] board) {
        if(board.length==0) return;
        int rows = board.length, col = board[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                int lives = liveNeighbor(board, rows, col, i, j);
                
                if(board[i][j]==1 && lives>=2 && lives<=3) board[i][j] = 3;
                
                if(board[i][j]==0 && lives==3) board[i][j]=2;
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                board[i][j] = board[i][j] >> 1;
            }
        }
    }
    
    public int liveNeighbor(int[][] board, int m, int n, int i, int j){
        int lives = 0;
        for(int s=Math.max(i-1, 0); s<=Math.min(m-1, i+1); s++){
            for(int e=Math.max(j-1, 0); e<=Math.min(n-1, j+1); e++){
                lives += board[s][e] & 1;
            }
        }
        lives -= board[i][j] & 1;
        return lives;
    }
}
