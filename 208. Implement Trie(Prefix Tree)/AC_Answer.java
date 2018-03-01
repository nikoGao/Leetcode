class TrieNode{
    public boolean isWord;
    public TrieNode[] nodes = new TrieNode[26];
    public TrieNode(){};
}
//build a dictionary tree, search time O(logn)
public class Trie {

    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ws.nodes[c-'a']==null)
                ws.nodes[c-'a'] = new TrieNode();
            ws = ws.nodes[c-'a'];
        }
        ws.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ws.nodes[c-'a']==null) return false;
            ws = ws.nodes[c -'a'];
        }
        return ws.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if(ws.nodes[c-'a']==null) return false;
            ws = ws.nodes[c -'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
