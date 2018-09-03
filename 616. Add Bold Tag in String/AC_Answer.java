class Solution {
    public String addBoldTag(String s, String[] dict) {
        if(s.length()==0 || dict.length==0) return s;
        
        boolean[] exist = new boolean[s.length()];
        // check for the existence of all string in dict
        for(int i=0, end =0; i<s.length(); i++){
            for(String str:dict){
                if(s.startsWith(str, i)) end = Math.max(end, i+str.length()); // for the purpose of changing all substring after it
            }
            exist[i] = end>i; // if end>i means we should contain it in bold
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!exist[i]){
                sb.append(s.charAt(i));
                continue;
            }
            int j = i;
            while(j<s.length() && exist[j]) j++;
            sb.append("<b>").append(s.substring(i,j)).append("</b>");
            // remember to move forward as in the for loop we will add 1 afterwards
            i = j-1;
        }
        return sb.toString();
    }
}
