class Solution {
    public int numDistinctIslands(int[][] grid) {
        /** To check the similar between two island, when we store, 
        we store the difference between coordinate with its top left one */
        int M = grid.length, N = grid[0].length;
        Set<List<List<Integer>>> islands = new HashSet<>(); // set can check duplicate list, but can't check array
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                List<List<Integer>> island = new ArrayList<>();
                if(dfs(i, j, i, j, M, N, island, grid)) islands.add(island);
            }
        }
        return islands.size();
    }
    
    public boolean dfs(int x0, int y0, int x, int y, int M, int N, List<List<Integer>> island, int[][] grid){
        if(x<0 || x>=M || y<0 || y>=N|| grid[x][y]<=0) return false;
        island.add(Arrays.asList(x-x0, y-y0));
        grid[x][y] *= -1;
        dfs(x0, y0, x+1, y, M, N, island, grid);
        dfs(x0, y0, x-1, y, M, N, island, grid);
        dfs(x0, y0, x, y+1, M, N, island, grid);
        dfs(x0, y0, x, y-1, M, N, island, grid);
        return true;
    }
}
