class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        if(dict.size()==0 || sentence.length()==0) return sentence;
        Set<String> successors = new HashSet<>();
        for(String root:dict) successors.add(root);
        
        String[] ss = sentence.split("\\s+");
        for(int i=0; i<ss.length; i++){
            String prefix = "";
            for(int j=1; j<ss[i].length(); j++){
                prefix = ss[i].substring(0, j);
                if(successors.contains(prefix)){
                    ss[i] = prefix;
                    break;
                }
            }
        }
        return String.join(" ", ss);
    }
}
