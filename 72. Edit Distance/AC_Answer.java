class Solution {
    public int minDistance(String word1, String word2) {
        int[][] operations = new int[word1.length()+1][word2.length()+1];
        int m = word1.length(), n = word2.length();
        for(int i=0; i<=m; i++) operations[i][0] = i;
        for(int i=0; i<=n; i++) operations[0][i] = i;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(word1.charAt(i)==word2.charAt(j)) operations[i+1][j+1] = operations[i][j];
                else{
                    // need to insert or delete or replace
                    operations[i+1][j+1] = 1 + Math.min(operations[i][j+1], Math.min(operations[i+1][j], operations[i][j]));
                }
            }
        }
        return operations[m][n];
    }
}
