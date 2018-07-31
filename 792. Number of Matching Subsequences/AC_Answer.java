class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        // must concern about the order of each substring
        Map<Character, Queue<String>> map = new HashMap<>();
        for(char c='a'; c<='z'; c++){
            map.put(c, new LinkedList<String>());
        }
        int count = 0;
        for(String w:words){
            map.get(w.charAt(0)).offer(w);
        }
	// walk through each elements of S, operate on map.get(c)
        for(char c:S.toCharArray()){
            Queue<String> temp = map.get(c);
            int size = temp.size();
            for(int i=0; i<size; i++){
                String s = temp.poll();
                if(s.length()==1) count++;
                else{
                    s = s.substring(1);
                    map.get(s.charAt(0)).offer(s);
                }
            }
        }
        return count;
    }
}
