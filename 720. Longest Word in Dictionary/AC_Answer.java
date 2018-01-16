class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        Arrays.sort(words);
        String result = "";
        for(String w:words){
            if(w.length()==1||set.contains(w.substring(0, w.length()-1))){
                result = w.length()>result.length()?w:result;
                set.add(w);
            }
        }
        return result;
    }
}
