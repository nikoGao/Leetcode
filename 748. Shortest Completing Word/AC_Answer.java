class Solution {
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] dict = new int[26];
        for(char c:licensePlate.toCharArray()){
            if(c>='a' && c<='z') {
                dict[c-'a']++;
            }
        }
        String result = "";
        for(String word:words){
            if(compare(word, Arrays.copyOf(dict, dict.length))){
                if(result.length()==0) result = word;
                else{
                    if(word.length()< result.length()) result = word;
                }
            }
        }
        return result;
    }
    
    public boolean compare(String word, int[] dict){
        for(char c:word.toCharArray()){
            dict[c-'a']--;
        }
        for(int i:dict){
            if(i>0) return false;
        }
        return true;
    }
}
