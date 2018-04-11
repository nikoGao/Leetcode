class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String w:words){
            String encode = generate(morses, w);
            set.add(encode);
        }
        return set.size();
    }
    
    public String generate(String[] morses, String word){
        String res = "";
        for(char c:word.toCharArray()){
            res += morses[c-'a'];
        }
        return res;
    }
}
