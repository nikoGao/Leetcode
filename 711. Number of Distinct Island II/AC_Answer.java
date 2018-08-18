class Solution {
    public int numDistinctIslands2(int[][] grid) {
        Set<String> result = new HashSet<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    List<int[]> coords = new LinkedList<>();
                    // find the island
                    dfs(i, j, grid, coords);
                    // compute all rotations and reflection of the island, use canonical hash as representation
                    result.add(canonical(coords));
                }
            }
        }
        return result.size();
    }
    
    public void dfs(int i, int j, int[][] grid, List<int[]> coords){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1) return;
        coords.add(new int[]{i, j});
        grid[i][j] = -1;
        dfs(i-1, j, grid, coords); dfs(i+1, j, grid, coords);
        dfs(i, j-1, grid, coords); dfs(i, j+1, grid, coords);
    }
    
    public String canonical(List<int[]> coords){
        TreeSet<String> represent = new TreeSet<>();
        // first, compute x y, x -y, -x y, -x -y || y x, y -x, -y x, -y -x
        for(int i=-1; i<2; i+=2){
            for(int j=-1; j<2; j+=2){
                List<int[]> s1 = new ArrayList<>(), s2 = new ArrayList<>(); 
                // compute a new shape's each coordinates
                for(int[] c:coords){
                    int x = c[0], y=c[1];
                    s1.add(new int[]{i*x, j*y});
                    s2.add(new int[]{i*y, j*x});
                }
                // change to string 
                represent.add(rewrite(s1));
                represent.add(rewrite(s2));
            }
        }
        // use the first one
        return represent.first();
    }
    
    public String rewrite(List<int[]> cells){
        Collections.sort(cells, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]==b[0]?a[1] - b[1] : a[0]-b[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int[] c:cells){
            sb.append(c[0]-cells.get(0)[0]).append(":").append(c[1] - cells.get(0)[1]).append(":");
        }
        return sb.toString();
    }
}
