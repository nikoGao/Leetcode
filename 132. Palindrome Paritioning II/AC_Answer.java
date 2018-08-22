class Solution {
    public int minCut(String s) {
        if(s.isEmpty()) return 0;
        
        int n = s.length();
        int[] cuts = new int[n];
        Arrays.fill(cuts, n);
        boolean[][] pal = new boolean[n][n];
        for(int i=n-1; i>=0; i--){
            cuts[i] = n - i - 1; // the maximum number of cuts for [i, n-1]
            for(int j=i; j<n; j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<2 || pal[i+1][j-1])){
                    // whether current [i, j] length is 1 or 2/ or [i+1, j-1] is already palindrome, so add two same chars is still palindrome
                    pal[i][j] = true;
                    if(j==n-1) cuts[i] = 0;
                    else cuts[i] = Math.min(cuts[i], cuts[j+1]+1);
                }
            }
        }
        return cuts[0];
    }
}
