class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dfs(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int length){
        int m = board.length;
        int n = board[0].length;
        if(i<0 || j<0 || i>=m||j>=n) return false;
        
        if(word.charAt(length) == board[i][j]){
            char temp = board[i][j];
            board[i][j]='#';
            if(length==word.length()-1){
                return true;
            }else if(dfs(board, word, i-1, j, length+1)
            ||dfs(board, word, i+1, j, length+1)
            ||dfs(board, word, i, j-1, length+1)
            ||dfs(board, word, i, j+1, length+1)){
                return true;
            }
            board[i][j]=temp;
        }
        return false;
    }
}
