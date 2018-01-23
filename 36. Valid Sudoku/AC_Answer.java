class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean truth = true;
        for(char[] row : board){
            int[] count = new int[9];
            for(char col : row){
                if(col!='.') count[col-'1']++;
            }
            for(int i:count) truth &= (i<2);
        }
        
        for(int i=0; i<9; i++){
            int[] count = new int[9];
            for(int j=0; j<9; j++){
                if(board[j][i]!='.') count[board[j][i]-'1']++;
            }
            for(int val:count) truth &= (val<2);
        }
        
        for(int i= 0; i<=6; i=i+3){
            for(int j=0; j<=6; j=j+3){
                int[] count = new int[9];
                int row = 0;
                while(row<3){
                    int col=0;
                    while(col<3){
                        if(board[i+row][j+col]!='.') count[board[i+row][j+col]-'1']++;
                        col++;
                    }
                    row++;
                }
                for(int val:count) truth &= (val<2);
            }
        }
        return truth;
    }
}
