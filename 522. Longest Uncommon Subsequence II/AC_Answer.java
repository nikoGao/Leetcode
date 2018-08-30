class Solution {
    public int findLUSlength(String[] strs) {
        if(strs.length==0) return 0;
        Arrays.sort(strs, new Comparator<String>(){
            public int compare(String a, String b){
                return b.length()-a.length();
            }
        });
        // get all duplicate one
        Set<String> store = new HashSet<>();
        Set<String> duplicate= new HashSet<>();
        for(String s:strs){
            if(store.contains(s)) duplicate.add(s);
            store.add(s);
        }
        for(int i=0; i<strs.length; i++){
            if(!duplicate.contains(strs[i])){
                if(i==0) return strs[i].length();
                for(int j=0; j<i; j++){
                    if(validation(strs[i], strs[j])) break;
                    if(j==i-1) return strs[i].length();
                }
            }
        }
        return -1;
    }
    
    public boolean validation(String candidate, String target){
        // check whether target contains candidate as a subsequence
        // find candidate in target->return true
        int i=0, j=0;
        while(i<candidate.length() && j<target.length()){
            if(candidate.charAt(i)==target.charAt(j)) i++;
            j++;
        } 
        return i==candidate.length();
    }
}
