class Solution {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        // the definition of similar totally satifies the definition of connection in union-find
        // use pairs to build a tree, if two string have same parent, then they are similar
        // if any one pair doesn't match, return false;
        // in this case, I can build a map instead of array id
        // follow up, when connecting, try to calculate the size of each map, connect smaller one to bigger one
        if(words1.length!=words2.length) return false;
        Map<String, String> tree = new HashMap<>();
        for(String[] p:pairs){
            String parent1 = find(tree, p[0]);
            String parent2 = find(tree, p[1]);
            if(!parent1.equals(parent2)) tree.put(parent1, parent2); // use parent1 as parent2's parent
        }
        // after building the tree, time to find
        for(int i=0; i<words1.length; i++){
            if(!words1[i].equals(words2[i]) && !find(tree, words1[i]).equals(find(tree, words2[i]))) return false;
        }
        return true;
    }
    
    public String find(Map<String, String> tree, String s){
        // recursion one
        if(!tree.containsKey(s)) tree.put(s, s);
        return tree.get(s).equals(s)? s:find(tree, tree.get(s));
    }
    
    public String find(Map<String, String> tree, String s){
        // iterative one
        if(!tree.containsKey(s)) tree.put(s, s);
        while(!tree.get(s).equals(s)){
            s = tree.get(s);
        }
        return s;
    }
}
