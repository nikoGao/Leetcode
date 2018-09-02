class Solution {
    public String splitLoopedString(String[] strs) {
        if(strs.length==0) return "";
        // find out the largest char we can find and verify whether we should reverse string
        char c = 'a';
        for(int i=0; i<strs.length; i++){
            for(char w:strs[i].toCharArray()){
                if(w>c) c= w;
            }
            String rev = new StringBuilder(strs[i]).reverse().toString();
            if(rev.compareTo(strs[i])>0) strs[i] = rev;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            // try to find c in each str
            String rev = new StringBuilder(strs[i]).reverse().toString();
            // think about abcihgfde, we may reverse it to get edfghicba, but if the largest on is i, ihg is greater than icba
            for(String str: new String[]{strs[i], rev}){
                for(int j = 0; j<str.length(); j++){
                    if(str.charAt(j)!=c) continue;
                    StringBuilder t = new StringBuilder(str.substring(j));
                    for(int k=i+1; k<strs.length; k++) t.append(strs[k]);
                    for(int k=0; k<i; k++) t.append(strs[k]);
                    t.append(str.substring(0, j));
                    if(t.toString().compareTo(sb.toString())>0) sb = t;
                }
            }
        }
        return sb.toString();
    }
}
