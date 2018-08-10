class MagicDictionary {
    
    private HashSet<String> dicts;
    private int max, min;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        dicts = new HashSet<>();
        max = 0;
        min = Integer.MAX_VALUE;
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String word:dict){
            max = Math.max(max, word.length());
            min = Math.min(min, word.length());
            dicts.add(word);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        if(word.length()<min || word.length()>max) return false;
        for(String d:dicts){
            if(d.length() != word.length()) continue;
            if(compare(d, word)){
                if(!d.equals(word)) return true;
            }
        }
        return false;
    }
    
    public boolean compare(String dict, String word){
        int count = 0, i=0;
        for(; i<dict.length(); i++){
            if(dict.charAt(i)!=word.charAt(i)) count++;
        }
        return count==1;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
