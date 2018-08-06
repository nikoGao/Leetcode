class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Map<Integer, Set<Integer>> map2 = new HashMap<>();
        for(int i=0; i<9; i++){
            int[] row = new int[9];
            for(int j=0; j<9; j++){
                if(i%3==0 && j==0) map2.clear();
                if(board[i][j]=='.') continue;
                // check row
                int num = Character.getNumericValue(board[i][j]);
                if(row[num-1] != 0) return false;
                row[num-1] = 1;
                // check column
                if(!map.containsKey(j)) map.put(j, new HashSet<>());
                if(!map.get(j).add(num)) return false;
                // check cube
                if(!map2.containsKey(i/3+j/3)) map2.put(i/3 + j/3, new HashSet<>());
                if(!map2.get(i/3+j/3).add(num)) return false;
            }
        }
        return true;
    }
}
