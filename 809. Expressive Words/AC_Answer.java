class Solution {
    public int expressiveWords(String S, String[] words) {
        int result = 0;
        if(words.length==0 || S.isEmpty()) return 0;
        char[] target = S.toCharArray();
        for(String str:words){
            if(str.length()>target.length) continue;
            int i=0, j=0;
            for(; i<target.length; i++){
                if(j<str.length() && target[i]==str.charAt(j)) j++;
                else if(i>0 && target[i-1]==target[i] && i+1<target.length && target[i+1]==target[i]) i++; // may find extension
                else if(!(i>1 && target[i]==target[i-1] && target[i]==target[i-2])) break;
            }
            result += (i==target.length && j==str.length()?1:0);
        }
        return result;
    }
}
