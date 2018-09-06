class Solution {
    public String crackSafe(int n, int k) {
        // I think RT is O(k^n) as it actually go through all possible results
        if(k==0 || n==0) return "";
        
        int combins = (int)Math.pow(k,n); // the number of all total secrets
        StringBuilder sb = new StringBuilder();
        Set<String> secrets = new HashSet<>();
        for(int i=0; i<n; i++) sb.append("0"); // start with all zero
        secrets.add(sb.toString());
        dfs(n, k, secrets, combins, sb);
        return sb.toString();
    }
    
    public boolean dfs(int n, int k, Set<String> secrets, int target, StringBuilder sb){
        if(secrets.size()==target) return true;
        String prefix = sb.substring(sb.length()-n+1, sb.length());
        for(int i=0; i<k; i++){
            String newS = prefix + i;
            if(!secrets.add(newS)) continue;
            sb.append(i);
            if(dfs(n, k, secrets, target, sb)) return true;
            else{
                sb.deleteCharAt(sb.length()-1);
                secrets.remove(newS);
            }
        }
        return false;
    }
    
}
