class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> l = new ArrayList<>();
        l.add(S);
        for(int j=0; j<l.size(); j++){
            S = l.get(j);
            int i=0;
            while(i<S.length()){
                if(!Character.isDigit(S.charAt(i))){
                    String sub = S.substring(0, i);
                    String s = S.substring(i, i+1);
                    boolean isUpper = (s==s.toUpperCase());
                    boolean isLower = (s==s.toLowerCase());
                    if(isUpper) s = s.toLowerCase();
                    if(isLower) s = s.toUpperCase();
                    String new_s = sub + s + S.substring(i+1, S.length());
                    if(!l.contains(new_s))
                        l.add(new_s);
                }
                i++;
            }
        }
        return l;
    }
}
