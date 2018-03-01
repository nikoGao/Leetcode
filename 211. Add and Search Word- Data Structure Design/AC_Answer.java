class TrieNode{
    public TrieNode[] children = new TrieNode[26];
    public String item = "";
    public TrieNode(){};
}

public class WordDictionary {

    private TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c-'a']==null){
                ws.children[c-'a'] = new TrieNode();
            }
            ws = ws.children[c-'a'];
        }
        ws.item = word;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }
    
    public boolean match(char[] cs, int k, TrieNode ws){
        if(k==cs.length) return !ws.item.equals("");
        if(cs[k]!='.') return ws.children[cs[k]-'a']!=null && match(cs, k+1, ws.children[cs[k]-'a']);
        else{
            for(int i=0; i<26; i++){
                if(ws.children[i] != null){
                    if(match(cs, k+1, ws.children[i])) return true;
                }
            }
            return false;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
