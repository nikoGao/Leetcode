class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        // O(n^k) solution
        // if string a + b is palindrome, then b must be the reversion of part of a
        List<List<Integer>> result = new ArrayList<>();
        if(words.length<2) return result;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++) map.put(words[i], i);
        
        for(int i=0; i<words.length; i++){
            // check each substring of string i
            // notice "" + words[i]
            for(int j=0; j<=words[i].length(); j++){
                String sub1 = words[i].substring(0, j);
                String sub2 = words[i].substring(j);
                if(check(sub1)){
                    // use sub1 as the middle of the concontation, then we need the reversion of substring2
                    String needed = new StringBuilder(sub2).reverse().toString();
                    if(map.containsKey(needed) && map.get(needed)!=i){
                        List<Integer> pair = new ArrayList<>();
                        pair.add(map.get(needed));
                        pair.add(i);
                        result.add(pair);
                    }
                }
                if(check(sub2) && sub2.length() !=0){ // to avoid duplication, to ensure "" + string/ string+"" only appear once
                    // use sub2 as the middle of the concontation, then we need the reversion of substring1
                    String needed = new StringBuilder(sub1).reverse().toString();
                    if(map.containsKey(needed) && map.get(needed)!=i){
                        List<Integer> pair = new ArrayList<>();
                        pair.add(i);
                        pair.add(map.get(needed));
                        result.add(pair);
                    }
                }
            }
        }
        return result;
    }
    
    public boolean check(String a){
        int i=0, j = a.length()-1;
        while(i<=j){
            if(a.charAt(i++) != a.charAt(j--)) return false;
        }
        return true;
    }
}
