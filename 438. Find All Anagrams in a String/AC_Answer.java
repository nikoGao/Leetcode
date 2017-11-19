class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int[] chars = new int[26];
        int length = p.length();
        if(s.length()<length||s==null||p==null) return res;
        for(char c: p.toCharArray())
            chars[c-'a']++;
        int start =0, end = 0, count=length;
        while(end < s.length()){
            //if the char at start appear in p, increase length
            if(end-start==length && chars[s.charAt(start++)-'a']>=0) count++;
            //if the char at end appear in p, decrease length
            if(--chars[s.charAt(end++)-'a']>=0) count--;
            if(count==0) res.add(start);
        }
        return res;
    }
}
